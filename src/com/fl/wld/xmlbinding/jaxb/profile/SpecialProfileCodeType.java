//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.23 at 12:01:59 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for specialProfileCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specialProfileCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>specialProfileCodeValue">
 *       &lt;attribute name="conditional_inheritance" type="{}yesNoFlag" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specialProfileCodeType", propOrder = {
    "value"
})
public class SpecialProfileCodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "conditional_inheritance")
    protected String conditionalInheritance;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the conditionalInheritance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalInheritance() {
        return conditionalInheritance;
    }

    /**
     * Sets the value of the conditionalInheritance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalInheritance(String value) {
        this.conditionalInheritance = value;
    }

}
