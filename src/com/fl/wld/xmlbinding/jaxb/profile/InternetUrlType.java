//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.23 at 12:01:59 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for internetUrlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="internetUrlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internet_URL_addr" type="{}string255" minOccurs="0"/>
 *         &lt;element name="internet_URL_notes" type="{}string70" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inherited_iu" type="{}yesNoFlag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "internetUrlType", propOrder = {
    "internetURLAddr",
    "internetURLNotes"
})
public class InternetUrlType {

    @XmlElement(name = "internet_URL_addr")
    protected String internetURLAddr;
    @XmlElement(name = "internet_URL_notes")
    protected String internetURLNotes;
    @XmlAttribute(name = "inherited_iu")
    protected String inheritedIu;

    /**
     * Gets the value of the internetURLAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetURLAddr() {
        return internetURLAddr;
    }

    /**
     * Sets the value of the internetURLAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetURLAddr(String value) {
        this.internetURLAddr = value;
    }

    /**
     * Gets the value of the internetURLNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetURLNotes() {
        return internetURLNotes;
    }

    /**
     * Sets the value of the internetURLNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetURLNotes(String value) {
        this.internetURLNotes = value;
    }

    /**
     * Gets the value of the inheritedIu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritedIu() {
        return inheritedIu;
    }

    /**
     * Sets the value of the inheritedIu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritedIu(String value) {
        this.inheritedIu = value;
    }

}
