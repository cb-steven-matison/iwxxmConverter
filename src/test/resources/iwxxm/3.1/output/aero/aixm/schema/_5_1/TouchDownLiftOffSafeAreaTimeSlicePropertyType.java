//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TouchDownLiftOffSafeAreaTimeSlicePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TouchDownLiftOffSafeAreaTimeSlicePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}TouchDownLiftOffSafeAreaTimeSlice"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TouchDownLiftOffSafeAreaTimeSlicePropertyType", propOrder = {
    "touchDownLiftOffSafeAreaTimeSlice"
})
public class TouchDownLiftOffSafeAreaTimeSlicePropertyType {

    @XmlElement(name = "TouchDownLiftOffSafeAreaTimeSlice", required = true)
    protected TouchDownLiftOffSafeAreaTimeSliceType touchDownLiftOffSafeAreaTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the touchDownLiftOffSafeAreaTimeSlice property.
     * 
     * @return
     *     possible object is
     *     {@link TouchDownLiftOffSafeAreaTimeSliceType }
     *     
     */
    public TouchDownLiftOffSafeAreaTimeSliceType getTouchDownLiftOffSafeAreaTimeSlice() {
        return touchDownLiftOffSafeAreaTimeSlice;
    }

    /**
     * Sets the value of the touchDownLiftOffSafeAreaTimeSlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchDownLiftOffSafeAreaTimeSliceType }
     *     
     */
    public void setTouchDownLiftOffSafeAreaTimeSlice(TouchDownLiftOffSafeAreaTimeSliceType value) {
        this.touchDownLiftOffSafeAreaTimeSlice = value;
    }

    public boolean isSetTouchDownLiftOffSafeAreaTimeSlice() {
        return (this.touchDownLiftOffSafeAreaTimeSlice!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

}
