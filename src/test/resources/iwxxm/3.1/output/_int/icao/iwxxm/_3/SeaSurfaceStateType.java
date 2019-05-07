//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package _int.icao.iwxxm._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.ReferenceType;


/**
 * Categorical assessment of sea surface state (or other large open body of water) based on height of waves.
 * 
 * Height in metres : Category
 * - 0 metres : Calm (glassy)
 * - 0-0.1 metres : Calm (rippled)
 * - 0.1-0.5 metres : Smooth
 * - 0.5-1.25 metres : Slight
 * - 1.25-2.5 metres : Moderate
 * - 2.5-4 metres : Rough
 * - 4-6 metres : Very rough
 * - 6-9 metres : High
 * - 9-14 metres : Very high
 * - >14 metres : Phenomenal
 * 
 * See WMO No. 306 Vol I.1 code table 3700 "State of the sea" and WMO No. 306 Vol I.2 FM 94 BUFR code table 0 22 061 "State of the sea".
 * 
 * <p>Java class for SeaSurfaceStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeaSurfaceStateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}ReferenceType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeaSurfaceStateType")
public class SeaSurfaceStateType
    extends ReferenceType
{


}
