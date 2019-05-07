//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21._int.icao.iwxxm._2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import schemabindings21.net.opengis.gml.v_3_2_1.AbstractFeatureType;
import schemabindings21.net.opengis.gml.v_3_2_1.AngleType;
import schemabindings21.net.opengis.gml.v_3_2_1.MeasureType;
import schemabindings21.net.opengis.gml.v_3_2_1.SpeedType;


/**
 * <p>Java class for TropicalCycloneObservedConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TropicalCycloneObservedConditionsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="movement" type="{http://icao.int/iwxxm/2.1}TropicalCycloneMovementType"/>
 *         &lt;element name="movementDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="movementSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/>
 *         &lt;element name="centralPressure" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="meanMaxSurfaceWind" type="{http://www.opengis.net/gml/3.2}SpeedType"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TropicalCycloneObservedConditionsType", propOrder = {
    "movement",
    "movementDirection",
    "movementSpeed",
    "centralPressure",
    "meanMaxSurfaceWind",
    "extension"
})
public class TropicalCycloneObservedConditionsType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TropicalCycloneMovementType movement;
    protected AngleType movementDirection;
    protected SpeedType movementSpeed;
    @XmlElement(required = true)
    protected MeasureType centralPressure;
    @XmlElement(required = true)
    protected SpeedType meanMaxSurfaceWind;
    protected List<Object> extension;

    /**
     * Gets the value of the movement property.
     * 
     * @return
     *     possible object is
     *     {@link TropicalCycloneMovementType }
     *     
     */
    public TropicalCycloneMovementType getMovement() {
        return movement;
    }

    /**
     * Sets the value of the movement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TropicalCycloneMovementType }
     *     
     */
    public void setMovement(TropicalCycloneMovementType value) {
        this.movement = value;
    }

    public boolean isSetMovement() {
        return (this.movement!= null);
    }

    /**
     * Gets the value of the movementDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getMovementDirection() {
        return movementDirection;
    }

    /**
     * Sets the value of the movementDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setMovementDirection(AngleType value) {
        this.movementDirection = value;
    }

    public boolean isSetMovementDirection() {
        return (this.movementDirection!= null);
    }

    /**
     * Gets the value of the movementSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getMovementSpeed() {
        return movementSpeed;
    }

    /**
     * Sets the value of the movementSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setMovementSpeed(SpeedType value) {
        this.movementSpeed = value;
    }

    public boolean isSetMovementSpeed() {
        return (this.movementSpeed!= null);
    }

    /**
     * Gets the value of the centralPressure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCentralPressure() {
        return centralPressure;
    }

    /**
     * Sets the value of the centralPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCentralPressure(MeasureType value) {
        this.centralPressure = value;
    }

    public boolean isSetCentralPressure() {
        return (this.centralPressure!= null);
    }

    /**
     * Gets the value of the meanMaxSurfaceWind property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getMeanMaxSurfaceWind() {
        return meanMaxSurfaceWind;
    }

    /**
     * Sets the value of the meanMaxSurfaceWind property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setMeanMaxSurfaceWind(SpeedType value) {
        this.meanMaxSurfaceWind = value;
    }

    public boolean isSetMeanMaxSurfaceWind() {
        return (this.meanMaxSurfaceWind!= null);
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

}
