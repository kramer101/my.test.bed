//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.23 at 12:01:59 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialtyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specialtyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sp_text" type="{}string70"/>
 *         &lt;element name="sp_certified_by" type="{}string70" minOccurs="0"/>
 *         &lt;element name="sp_year" type="{}digitYearType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specialtyType", propOrder = {
    "spText",
    "spCertifiedBy",
    "spYear"
})
public class SpecialtyType {

    @XmlElement(name = "sp_text", required = true)
    protected String spText;
    @XmlElement(name = "sp_certified_by")
    protected String spCertifiedBy;
    @XmlElement(name = "sp_year")
    protected String spYear;

    /**
     * Gets the value of the spText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpText() {
        return spText;
    }

    /**
     * Sets the value of the spText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpText(String value) {
        this.spText = value;
    }

    /**
     * Gets the value of the spCertifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpCertifiedBy() {
        return spCertifiedBy;
    }

    /**
     * Sets the value of the spCertifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpCertifiedBy(String value) {
        this.spCertifiedBy = value;
    }

    /**
     * Gets the value of the spYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpYear() {
        return spYear;
    }

    /**
     * Sets the value of the spYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpYear(String value) {
        this.spYear = value;
    }

}
