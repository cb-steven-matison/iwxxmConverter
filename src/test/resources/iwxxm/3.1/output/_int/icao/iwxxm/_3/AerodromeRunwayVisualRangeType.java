//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package _int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeRunwayVisualRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayVisualRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runway" type="{http://icao.int/iwxxm/3.0}RunwayDirectionPropertyType"/>
 *         &lt;element name="meanRVR" type="{http://icao.int/iwxxm/3.0}DistanceWithNilReasonType"/>
 *         &lt;element name="meanRVROperator" type="{http://icao.int/iwxxm/3.0}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pastTendency" type="{http://icao.int/iwxxm/3.0}VisualRangeTendencyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeRunwayVisualRangeType", propOrder = {
    "runway",
    "meanRVR",
    "meanRVROperator",
    "extension"
})
public class AerodromeRunwayVisualRangeType {

    @XmlElement(required = true, nillable = true)
    protected RunwayDirectionPropertyType runway;
    @XmlElement(required = true, nillable = true)
    protected DistanceWithNilReasonType meanRVR;
    @XmlElementRef(name = "meanRVROperator", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<RelationalOperatorType> meanRVROperator;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "pastTendency")
    protected VisualRangeTendencyType pastTendency;

    /**
     * Gets the value of the runway property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDirectionPropertyType }
     *     
     */
    public RunwayDirectionPropertyType getRunway() {
        return runway;
    }

    /**
     * Sets the value of the runway property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDirectionPropertyType }
     *     
     */
    public void setRunway(RunwayDirectionPropertyType value) {
        this.runway = value;
    }

    public boolean isSetRunway() {
        return (this.runway!= null);
    }

    /**
     * Gets the value of the meanRVR property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public DistanceWithNilReasonType getMeanRVR() {
        return meanRVR;
    }

    /**
     * Sets the value of the meanRVR property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public void setMeanRVR(DistanceWithNilReasonType value) {
        this.meanRVR = value;
    }

    public boolean isSetMeanRVR() {
        return (this.meanRVR!= null);
    }

    /**
     * Gets the value of the meanRVROperator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public JAXBElement<RelationalOperatorType> getMeanRVROperator() {
        return meanRVROperator;
    }

    /**
     * Sets the value of the meanRVROperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public void setMeanRVROperator(JAXBElement<RelationalOperatorType> value) {
        this.meanRVROperator = value;
    }

    public boolean isSetMeanRVROperator() {
        return (this.meanRVROperator!= null);
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
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    /**
     * Gets the value of the pastTendency property.
     * 
     * @return
     *     possible object is
     *     {@link VisualRangeTendencyType }
     *     
     */
    public VisualRangeTendencyType getPastTendency() {
        return pastTendency;
    }

    /**
     * Sets the value of the pastTendency property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualRangeTendencyType }
     *     
     */
    public void setPastTendency(VisualRangeTendencyType value) {
        this.pastTendency = value;
    }

    public boolean isSetPastTendency() {
        return (this.pastTendency!= null);
    }

}
