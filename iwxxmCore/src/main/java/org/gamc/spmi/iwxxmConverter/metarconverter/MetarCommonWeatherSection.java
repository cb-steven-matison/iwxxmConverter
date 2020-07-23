/**
 * Copyright (C) 2018 Dmitry Moryakov, Main aeronautical meteorological center, Moscow, Russia
 * moryakovdv[at]gmail[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gamc.spmi.iwxxmConverter.metarconverter;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;

import org.gamc.spmi.iwxxmConverter.common.AnnotationLocalizedName;
import org.gamc.spmi.iwxxmConverter.general.CommonWeatherSection;
import org.gamc.spmi.iwxxmConverter.iwxxmenums.LENGTH_UNITS;
import org.gamc.spmi.iwxxmConverter.iwxxmenums.PRESSURE_UNITS;
import org.gamc.spmi.iwxxmConverter.iwxxmenums.RUMB_UNITS;
import org.gamc.spmi.iwxxmConverter.iwxxmenums.SPEED_UNITS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Embedded objects of this class are used to describe common weather condition
 * in METAR itself, BECMG or TEMPO sections
 */
public class MetarCommonWeatherSection implements CommonWeatherSection {
    
        private Logger MetarCommonWeatherSectionLogger = LoggerFactory.getLogger(MetarCommonWeatherSection.class);
        
	boolean failWhenMandatorySectionMissed = true;
	@AnnotationLocalizedName(name = "Direction of the wind")
	private Integer windDir;
	@AnnotationLocalizedName(name = "Wind speed")
	private Integer windSpeed;
	@AnnotationLocalizedName(name = "gust of wind")
	private Integer gustSpeed;
	@AnnotationLocalizedName(name = "Wind speed unit")
	private SPEED_UNITS speedUnits = SPEED_UNITS.MPS;

	// if wind direction variables and speed>6m/s
	@AnnotationLocalizedName(name = "Change in wind direction from")
	private Integer windVariableFrom;
	@AnnotationLocalizedName(name = "Change in wind direction to")
	private Integer windVariableTo;

	// VRB if wind direction variables and speed<6m/s
	@AnnotationLocalizedName(name = "The presence of a variable")
	private boolean vrb;
	@AnnotationLocalizedName(name = "Wind speed vrb")
	private Integer windVrbSpeed;
	@AnnotationLocalizedName(name = "Wind speed unit vrb")
	private SPEED_UNITS vrbSpeedUnits = SPEED_UNITS.MPS;
	@AnnotationLocalizedName(name = "Availability of CAVOK")
	private boolean cavok = false;
	@AnnotationLocalizedName(name = "Temperature")
	private BigDecimal airTemperature;
	@AnnotationLocalizedName(name = "Dew point")
	private BigDecimal dewPoint;
	@AnnotationLocalizedName(name = "Pressure QNH")
	private BigDecimal qnh;
	@AnnotationLocalizedName(name = "Pressure unit")
	private PRESSURE_UNITS qnhUnits = PRESSURE_UNITS.HECTOPASCALS;
	@AnnotationLocalizedName(name = "Prevailing visibility")
	private Integer prevailVisibility;
	@AnnotationLocalizedName(name = "Minimum visibility")
	private Integer minimumVisibility;
	@AnnotationLocalizedName(name = "Direction of minimum visibility")
	private RUMB_UNITS minimumVisibilityDirection;
	@AnnotationLocalizedName(name = "Visibility unit")
	private LENGTH_UNITS visibilityUnits = LENGTH_UNITS.M;
	@AnnotationLocalizedName(name = "List of current weather events")
	private LinkedList<String> currentWeather = new LinkedList<String>();
	@AnnotationLocalizedName(name = "List of recent weather events")
	private LinkedList<String> recentWeather = new LinkedList<String>();
	@AnnotationLocalizedName(name = "List of sections of vertical visibility")
	private LinkedList<METARCloudSection> cloudSections = new LinkedList<METARCloudSection>();

	/**
	 * If we parse TEMPO or BECMG sections, we can ask parser NOT to fail when some
	 * mandatory section are missed .
	 */
	public MetarCommonWeatherSection(boolean failWhenMandatorySectionMissed) {

		this.failWhenMandatorySectionMissed = failWhenMandatorySectionMissed;

	}

	public StringBuffer parseSection(StringBuffer tac) throws METARParsingException {
                
		// parsing Winds
		boolean hasWindSection = false;
		int lastIndex = 0;
               
                MetarCommonWeatherSectionLogger.debug("parseSection start");
        
		MetarCommonWeatherSectionLogger.debug("parseSection 1");
                Matcher matcher = MetarParsingRegexp.metarWind.matcher(tac);
		if (matcher.find()) {
			String sWd = matcher.group("windDir");
			String sWs = matcher.group("windSpeed");
			String sWsU = matcher.group("speedUnits");

			String sGs = matcher.group("gustSpeed");
			String sGsU = matcher.group("gustSpeedUnits");

			if (sWd != null)
				this.setWindDir(Integer.valueOf(sWd));

			if (sWs != null)
				this.setWindSpeed(Integer.valueOf(sWs));

			if (sWsU != null)
				this.setSpeedUnits(SPEED_UNITS.valueOf(sWsU));

			if (sGs != null)
				this.setGustSpeed(Integer.valueOf(sGs));

			if (sGsU != null)
				this.setSpeedUnits(SPEED_UNITS.valueOf(sGsU));

			lastIndex = matcher.end();
			tac.delete(0, lastIndex);
			hasWindSection = true;
		}

		// wind variable
		MetarCommonWeatherSectionLogger.debug("parseSection 2");
                matcher = MetarParsingRegexp.metarWindVariable.matcher(tac);
		if (matcher.find()) {
			String sVf = matcher.group("variableFrom");
			String sVt = matcher.group("variableTo");

			this.setWindVariableFrom(Integer.valueOf(sVf));
			this.setWindVariableTo(Integer.valueOf(sVt));

			lastIndex = matcher.end();
			tac.delete(0, lastIndex);
			hasWindSection = true;
		}

		// has VRB?
		MetarCommonWeatherSectionLogger.debug("parseSection 3");
                matcher = MetarParsingRegexp.metarWindVRB.matcher(tac);
		if (matcher.find()) {
			String sVrbS = matcher.group("vrbWindSpeed");
			String sVrbU = matcher.group("vrbWindUnits");

			this.setVrb(true);
			this.setWindVrbSpeed(Integer.valueOf(sVrbS));
			this.setVrbSpeedUnits(SPEED_UNITS.valueOf(sVrbU));

			lastIndex = matcher.end();
			tac.delete(0, lastIndex);
			hasWindSection = true;
		}

		MetarCommonWeatherSectionLogger.debug("parseSection 4");
                if (!hasWindSection && failWhenMandatorySectionMissed)
			throw new METARParsingException("METAR mandatory wind section is missed");

		// CAVOK?

		MetarCommonWeatherSectionLogger.debug("parseSection 5");
                matcher = MetarParsingRegexp.metarCavok.matcher(tac);
		if (matcher.find()) {

			this.setCavok(true);
			lastIndex = matcher.end();
			tac.delete(0, lastIndex);
		}

		// process visibility in two steps - find prevail and minimum visibility
		MetarCommonWeatherSectionLogger.debug("parseSection 6");
                matcher = MetarParsingRegexp.metarVisibility.matcher(tac);
		if (matcher.find()) {

			if (this.isCavok())
				throw new METARParsingException("It is CAVOK");

			String sPv = matcher.group("visibility");

			if (sPv.endsWith("SM")) {
				this.setVisibilityUnits(LENGTH_UNITS.SM);
				sPv = sPv.replaceFirst("SM$", "");
			}

			if (sPv != null)
				this.setPrevailVisibility(Integer.valueOf(sPv));
			lastIndex = matcher.end();
			tac.delete(0, lastIndex);
		}
		matcher.reset();

		MetarCommonWeatherSectionLogger.debug("parseSection 7");
                if (matcher.find() && matcher.start() <= 1) {

			if (this.isCavok())
				throw new METARParsingException("It is CAVOK");

			String sMv = matcher.group("visibility");
			String sMVd = matcher.group("visibilityDirection");
			if (sMv != null)
				this.setMinimumVisibility(Integer.valueOf(sMv));
			if (sMVd != null)
				this.setMinimumVisibilityDirection(RUMB_UNITS.valueOf(sMVd));

			lastIndex = matcher.end();
			tac.delete(0, lastIndex);
		}

		// process precipitations

		MetarCommonWeatherSectionLogger.debug("parseSection 8");
                matcher = MetarParsingRegexp.metarPrecipitation.matcher(tac);
		while (matcher.find()) {

			String curWeather = matcher.group("weather");
			this.getCurrentWeather().add(curWeather);

			lastIndex = matcher.end();

		}

		MetarCommonWeatherSectionLogger.debug("parseSection 9");
                if (this.getCurrentWeather().size() > 0)
			tac.delete(0, lastIndex);

		// processClouds
		MetarCommonWeatherSectionLogger.debug("parseSection 10");
                matcher = MetarParsingRegexp.metarClouds.matcher(tac);
		while (matcher.find()) {

			if (this.isCavok())
				throw new METARParsingException("It is CAVOK");

			int start = matcher.start();
			int end = matcher.end();

			String cloudAmount = matcher.group("cloudAmount");

			String cloudHeight = matcher.group("cloudHeight");
			String cloudType = matcher.group("cloudType");
			METARCloudSection cloudSec = new METARCloudSection(tac.substring(start, end));

			cloudSec.setAmount(cloudAmount);

			// convert to hundreds of feets
			if (cloudAmount.equalsIgnoreCase("VV"))
				cloudSec.setVerticalVisibility(true);

			if (!cloudHeight.equalsIgnoreCase("///"))
				cloudSec.setHeight(Integer.valueOf(cloudHeight) * 100);

			cloudSec.setType(cloudType);

			this.getCloudSections().add(cloudSec);

			lastIndex = matcher.end();

		}

		MetarCommonWeatherSectionLogger.debug("parseSection 11");
                if (this.getCloudSections().size() > 0)
			tac.delete(0, lastIndex);

		// Temperatures
		MetarCommonWeatherSectionLogger.debug("parseSection 12");
                matcher = MetarParsingRegexp.metarAirTemp.matcher(tac);
		if (matcher.find()) {

			String sTa = matcher.group("tempAir").replace("M", "-");
			String sDp = matcher.group("dewPoint").replace("M", "-");

			this.setAirTemperature(new BigDecimal(sTa));
			this.setDewPoint(new BigDecimal(sDp));

			lastIndex = matcher.end();
			tac.delete(0, lastIndex);

		} else if (failWhenMandatorySectionMissed) {
			throw new IllegalArgumentException("Wrong or missed temperature section");
		}

		// QNH
		MetarCommonWeatherSectionLogger.debug("parseSection 13");
                matcher = MetarParsingRegexp.metarQNH.matcher(tac);
		if (matcher.find()) {

			String sQnh = matcher.group("qnh");
			String sQnhU = matcher.group("qnhUnits");
			this.setQnhUnits(
					sQnhU.equalsIgnoreCase("A") ? PRESSURE_UNITS.INCH_OF_MERCURY : PRESSURE_UNITS.HECTOPASCALS);
			this.setQnh(new BigDecimal(sQnh));
			lastIndex = matcher.end();
			tac.delete(0, lastIndex);

		} else if (failWhenMandatorySectionMissed) {
			throw new IllegalArgumentException("Wrong or missed QNH section");
		}

		// process recent weather
		MetarCommonWeatherSectionLogger.debug("parseSection 14");
                matcher = MetarParsingRegexp.metarRecentWeather.matcher(tac);
		int start = 0;
		while (matcher.find()) {

			String recWeather = matcher.group("recentWeather");
			if (start == 0) {
				start = matcher.start();
			}

			this.getRecentWeather().add(recWeather);

			lastIndex = matcher.end();

		}

		MetarCommonWeatherSectionLogger.debug("parseSection 15");
                if (this.getRecentWeather().size() > 0)
			tac.delete(start, lastIndex);

		MetarCommonWeatherSectionLogger.debug("parseSection end");
                return tac;

	}

	public Integer getWindDir() {
		return windDir;
	}

	public void setWindDir(Integer windDir) {
		this.windDir = windDir;
	}

	public Integer getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Integer windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Integer getGustSpeed() {
		return gustSpeed;
	}

	public void setGustSpeed(Integer gustSpeed) {
		this.gustSpeed = gustSpeed;
	}

	public SPEED_UNITS getSpeedUnits() {
		return speedUnits;
	}

	public void setSpeedUnits(SPEED_UNITS speedUnits) {
		this.speedUnits = speedUnits;
	}

	public Integer getWindVariableFrom() {
		return windVariableFrom;
	}

	public void setWindVariableFrom(Integer windVariableFrom) {
		this.windVariableFrom = windVariableFrom;
	}

	public Integer getWindVariableTo() {
		return windVariableTo;
	}

	public void setWindVariableTo(Integer windVariableTo) {
		this.windVariableTo = windVariableTo;
	}

	public boolean isVrb() {
		return vrb;
	}

	public void setVrb(boolean vrb) {
		this.vrb = vrb;
	}

	public Integer getWindVrbSpeed() {
		return windVrbSpeed;
	}

	public void setWindVrbSpeed(Integer windVrbSpeed) {
		this.windVrbSpeed = windVrbSpeed;
	}

	public SPEED_UNITS getVrbSpeedUnits() {
		return vrbSpeedUnits;
	}

	public void setVrbSpeedUnits(SPEED_UNITS vrbSpeedUnits) {
		this.vrbSpeedUnits = vrbSpeedUnits;
	}

	public BigDecimal getAirTemperature() {
		return airTemperature;
	}

	public void setAirTemperature(BigDecimal airTemperature) {
		this.airTemperature = airTemperature;
	}

	public BigDecimal getDewPoint() {
		return dewPoint;
	}

	public void setDewPoint(BigDecimal dewPoint) {
		this.dewPoint = dewPoint;
	}

	public BigDecimal getQnh() {
		return qnh;
	}

	public void setQnh(BigDecimal qnh) {
		this.qnh = qnh;
	}

	public PRESSURE_UNITS getQnhUnits() {
		return qnhUnits;
	}

	public void setQnhUnits(PRESSURE_UNITS qnhUnits) {
		this.qnhUnits = qnhUnits;
	}

	public Integer getPrevailVisibility() {
		return prevailVisibility;
	}

	public void setPrevailVisibility(Integer prevailVisibility) {
		this.prevailVisibility = prevailVisibility;
	}

	public Integer getMinimumVisibility() {
		return minimumVisibility;
	}

	public void setMinimumVisibility(Integer minimumVisibility) {
		this.minimumVisibility = minimumVisibility;
	}

	public RUMB_UNITS getMinimumVisibilityDirection() {
		return minimumVisibilityDirection;
	}

	public void setMinimumVisibilityDirection(RUMB_UNITS minimumVisibilityDirection) {
		this.minimumVisibilityDirection = minimumVisibilityDirection;
	}

	public LENGTH_UNITS getVisibilityUnits() {
		return visibilityUnits;
	}

	public void setVisibilityUnits(LENGTH_UNITS visibilityUnits) {
		this.visibilityUnits = visibilityUnits;
	}

	public LinkedList<String> getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(LinkedList<String> currentWeather) {
		this.currentWeather = currentWeather;
	}

	public LinkedList<METARCloudSection> getCloudSections() {
		return cloudSections;
	}

	public boolean isCavok() {
		return cavok;
	}

	public void setCavok(boolean cavok) {
		this.cavok = cavok;
	}

	public LinkedList<String> getRecentWeather() {
		return recentWeather;
	}

	public void setRecentWeather(LinkedList<String> recentWeather) {
		this.recentWeather = recentWeather;
	}

	HashMap<String, Object> hashNames = new HashMap<String, Object>();

	public HashMap<String, Object> getHashNames() {
		return hashNames;
	}

	public void setHashNames(HashMap<String, Object> hashNames) {
		this.hashNames = hashNames;
	}

	public HashMap<String, Object> getLocalizedNameValues() {

		Field[] flds = this.getClass().getDeclaredFields();
		for (Field f : flds) {

			AnnotationLocalizedName ann = f.getAnnotation(AnnotationLocalizedName.class);
			if (ann != null) {

				String lname = ann.name();
				try {
					f.setAccessible(true);
					Object fieldValue = f.get(this);
					hashNames.put(lname, fieldValue);
					f.setAccessible(false);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return hashNames;

	}
}
