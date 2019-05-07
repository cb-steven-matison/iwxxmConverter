//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package aero.aixm.schema._5_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertiesWithSchedulePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertiesWithSchedulePropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithSchedule"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertiesWithSchedulePropertyType", propOrder = {
    "abstractPropertiesWithSchedule"
})
public class PropertiesWithSchedulePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "AbstractPropertiesWithSchedule", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractPropertiesWithScheduleType> abstractPropertiesWithSchedule;

    /**
     * Gets the value of the abstractPropertiesWithSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentMonitoringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcedureAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelephoneContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDeclaredDistanceValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPropertiesWithScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkareaActivityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceLayerClassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceActivationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundLightingAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureLightingStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LightElementStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaAvailabilityType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractPropertiesWithScheduleType> getAbstractPropertiesWithSchedule() {
        return abstractPropertiesWithSchedule;
    }

    /**
     * Sets the value of the abstractPropertiesWithSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentMonitoringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcedureAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelephoneContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDeclaredDistanceValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPropertiesWithScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkareaActivityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceLayerClassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceActivationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundLightingAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureLightingStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LightElementStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaAvailabilityType }{@code >}
     *     
     */
    public void setAbstractPropertiesWithSchedule(JAXBElement<? extends AbstractPropertiesWithScheduleType> value) {
        this.abstractPropertiesWithSchedule = value;
    }

    public boolean isSetAbstractPropertiesWithSchedule() {
        return (this.abstractPropertiesWithSchedule!= null);
    }

}
