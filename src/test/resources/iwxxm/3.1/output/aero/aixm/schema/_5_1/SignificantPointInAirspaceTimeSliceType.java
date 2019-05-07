//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package aero.aixm.schema._5_1;

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
 * <p>Java class for SignificantPointInAirspaceTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignificantPointInAirspaceTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}SignificantPointInAirspacePropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSignificantPointInAirspaceExtension"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignificantPointInAirspaceTimeSliceType", propOrder = {
    "type",
    "relativeLocation",
    "containingAirspace",
    "locationFixDesignatedPoint",
    "locationNavaidSystem",
    "locationPosition",
    "locationRunwayPoint",
    "locationAimingPoint",
    "locationAirportReferencePoint",
    "annotation",
    "extension"
})
public class SignificantPointInAirspaceTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspacePointRoleType> type;
    @XmlElementRef(name = "relativeLocation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspacePointPositionType> relativeLocation;
    @XmlElementRef(name = "containingAirspace", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> containingAirspace;
    @XmlElementRef(name = "location_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> locationFixDesignatedPoint;
    @XmlElementRef(name = "location_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> locationNavaidSystem;
    @XmlElementRef(name = "location_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> locationPosition;
    @XmlElementRef(name = "location_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> locationRunwayPoint;
    @XmlElementRef(name = "location_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> locationAimingPoint;
    @XmlElementRef(name = "location_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> locationAirportReferencePoint;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SignificantPointInAirspaceTimeSliceType.Extension> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointRoleType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspacePointRoleType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointRoleType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAirspacePointRoleType> value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the relativeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointPositionType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspacePointPositionType> getRelativeLocation() {
        return relativeLocation;
    }

    /**
     * Sets the value of the relativeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointPositionType }{@code >}
     *     
     */
    public void setRelativeLocation(JAXBElement<CodeAirspacePointPositionType> value) {
        this.relativeLocation = value;
    }

    public boolean isSetRelativeLocation() {
        return (this.relativeLocation!= null);
    }

    /**
     * Gets the value of the containingAirspace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspacePropertyType> getContainingAirspace() {
        return containingAirspace;
    }

    /**
     * Sets the value of the containingAirspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setContainingAirspace(JAXBElement<AirspacePropertyType> value) {
        this.containingAirspace = value;
    }

    public boolean isSetContainingAirspace() {
        return (this.containingAirspace!= null);
    }

    /**
     * Gets the value of the locationFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getLocationFixDesignatedPoint() {
        return locationFixDesignatedPoint;
    }

    /**
     * Sets the value of the locationFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setLocationFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.locationFixDesignatedPoint = value;
    }

    public boolean isSetLocationFixDesignatedPoint() {
        return (this.locationFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the locationNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getLocationNavaidSystem() {
        return locationNavaidSystem;
    }

    /**
     * Sets the value of the locationNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setLocationNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.locationNavaidSystem = value;
    }

    public boolean isSetLocationNavaidSystem() {
        return (this.locationNavaidSystem!= null);
    }

    /**
     * Gets the value of the locationPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getLocationPosition() {
        return locationPosition;
    }

    /**
     * Sets the value of the locationPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setLocationPosition(JAXBElement<PointPropertyType> value) {
        this.locationPosition = value;
    }

    public boolean isSetLocationPosition() {
        return (this.locationPosition!= null);
    }

    /**
     * Gets the value of the locationRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getLocationRunwayPoint() {
        return locationRunwayPoint;
    }

    /**
     * Sets the value of the locationRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setLocationRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.locationRunwayPoint = value;
    }

    public boolean isSetLocationRunwayPoint() {
        return (this.locationRunwayPoint!= null);
    }

    /**
     * Gets the value of the locationAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getLocationAimingPoint() {
        return locationAimingPoint;
    }

    /**
     * Sets the value of the locationAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setLocationAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.locationAimingPoint = value;
    }

    public boolean isSetLocationAimingPoint() {
        return (this.locationAimingPoint!= null);
    }

    /**
     * Gets the value of the locationAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getLocationAirportReferencePoint() {
        return locationAirportReferencePoint;
    }

    /**
     * Sets the value of the locationAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setLocationAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.locationAirportReferencePoint = value;
    }

    public boolean isSetLocationAirportReferencePoint() {
        return (this.locationAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
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
     * {@link SignificantPointInAirspaceTimeSliceType.Extension }
     * 
     * 
     */
    public List<SignificantPointInAirspaceTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<SignificantPointInAirspaceTimeSliceType.Extension>();
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSignificantPointInAirspaceExtension"/>
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
    @XmlType(name = "", propOrder = {
        "abstractSignificantPointInAirspaceExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractSignificantPointInAirspaceExtension", required = true)
        protected AbstractExtensionType abstractSignificantPointInAirspaceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractSignificantPointInAirspaceExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractSignificantPointInAirspaceExtension() {
            return abstractSignificantPointInAirspaceExtension;
        }

        /**
         * Sets the value of the abstractSignificantPointInAirspaceExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractSignificantPointInAirspaceExtension(AbstractExtensionType value) {
            this.abstractSignificantPointInAirspaceExtension = value;
        }

        public boolean isSetAbstractSignificantPointInAirspaceExtension() {
            return (this.abstractSignificantPointInAirspaceExtension!= null);
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

}
