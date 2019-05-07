//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21._int.wmo.def.opm._2013;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import schemabindings21.net.opengis.gml.v_3_2_1.UnitOfMeasureType;


/**
 * <p>Java class for QualifiedObservablePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiedObservablePropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://def.wmo.int/opm/2013}ObservablePropertyType">
 *       &lt;sequence>
 *         &lt;element name="unitOfMeasure" type="{http://www.opengis.net/gml/3.2}UnitOfMeasureType" minOccurs="0"/>
 *         &lt;element name="constraint" type="{http://def.wmo.int/opm/2013}ConstraintPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qualifier" type="{http://def.wmo.int/opm/2013}StatisticalQualifierPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baseProperty" type="{http://def.wmo.int/opm/2013}ObservablePropertyPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedObservablePropertyType", propOrder = {
    "unitOfMeasure",
    "constraint",
    "qualifier",
    "baseProperty"
})
public class QualifiedObservablePropertyType
    extends ObservablePropertyType
{

    protected UnitOfMeasureType unitOfMeasure;
    protected List<ConstraintPropertyType> constraint;
    protected List<StatisticalQualifierPropertyType> qualifier;
    @XmlElement(required = true)
    protected ObservablePropertyPropertyType baseProperty;

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasureType value) {
        this.unitOfMeasure = value;
    }

    public boolean isSetUnitOfMeasure() {
        return (this.unitOfMeasure!= null);
    }

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintPropertyType }
     * 
     * 
     */
    public List<ConstraintPropertyType> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<ConstraintPropertyType>();
        }
        return this.constraint;
    }

    public boolean isSetConstraint() {
        return ((this.constraint!= null)&&(!this.constraint.isEmpty()));
    }

    public void unsetConstraint() {
        this.constraint = null;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticalQualifierPropertyType }
     * 
     * 
     */
    public List<StatisticalQualifierPropertyType> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<StatisticalQualifierPropertyType>();
        }
        return this.qualifier;
    }

    public boolean isSetQualifier() {
        return ((this.qualifier!= null)&&(!this.qualifier.isEmpty()));
    }

    public void unsetQualifier() {
        this.qualifier = null;
    }

    /**
     * Gets the value of the baseProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public ObservablePropertyPropertyType getBaseProperty() {
        return baseProperty;
    }

    /**
     * Sets the value of the baseProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public void setBaseProperty(ObservablePropertyPropertyType value) {
        this.baseProperty = value;
    }

    public boolean isSetBaseProperty() {
        return (this.baseProperty!= null);
    }

}
