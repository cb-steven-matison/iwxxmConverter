//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21._int.icao.iwxxm._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissibleUsageReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PermissibleUsageReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEST"/>
 *     &lt;enumeration value="EXERCISE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermissibleUsageReasonType")
@XmlEnum
public enum PermissibleUsageReasonType {


    /**
     * Data is part of a test activity and should not be used for operational purposes.  This may include circumstances such as issuing a single message to assess a new data network path, or as part of a more organized test of message distribution/availability such as a regional SIGMET test
     * 
     */
    TEST,

    /**
     * Data is part of a test exercise and should not be used for operational purposes.  This may include circumstances where realistic data is issued to be used in organized exercises where users will practice or train for potential scenarios.  For example, VA SIGMET exercises may include realistic data which is intended to be considered by users participating in the exercise but is not intended for operational use
     * 
     */
    EXERCISE;

    public String value() {
        return name();
    }

    public static PermissibleUsageReasonType fromValue(String v) {
        return valueOf(v);
    }

}
