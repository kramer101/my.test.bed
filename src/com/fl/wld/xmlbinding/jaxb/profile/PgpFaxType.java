//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.23 at 12:01:59 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for pgpFaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pgpFaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pgp_fax_number" type="{}string100" minOccurs="0"/>
 *         &lt;element name="pgp_fax_notes" type="{}string70" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inherited_pgp_fax" type="{}yesNoFlag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pgpFaxType", propOrder = {
    "pgpFaxNumber",
    "pgpFaxNotes"
})
public class PgpFaxType {

    @XmlElement(name = "pgp_fax_number")
    protected String pgpFaxNumber;
    @XmlElement(name = "pgp_fax_notes")
    protected String pgpFaxNotes;
    @XmlAttribute(name = "inherited_pgp_fax")
    protected String inheritedPgpFax;

    /**
     * Gets the value of the pgpFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgpFaxNumber() {
        return pgpFaxNumber;
    }

    /**
     * Sets the value of the pgpFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgpFaxNumber(String value) {
        this.pgpFaxNumber = value;
    }

    /**
     * Gets the value of the pgpFaxNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgpFaxNotes() {
        return pgpFaxNotes;
    }

    /**
     * Sets the value of the pgpFaxNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgpFaxNotes(String value) {
        this.pgpFaxNotes = value;
    }

    /**
     * Gets the value of the inheritedPgpFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritedPgpFax() {
        return inheritedPgpFax;
    }

    /**
     * Sets the value of the inheritedPgpFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritedPgpFax(String value) {
        this.inheritedPgpFax = value;
    }

}
