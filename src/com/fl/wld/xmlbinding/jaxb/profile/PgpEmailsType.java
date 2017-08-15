//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.23 at 12:01:59 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for pgpEmailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pgpEmailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PGP_Email" type="{}pgpEmailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inherited_pgp_email" type="{}yesNoFlag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pgpEmailsType", propOrder = {
    "pgpEmail"
})
public class PgpEmailsType {

    @XmlElement(name = "PGP_Email")
    protected List<PgpEmailType> pgpEmail;
    @XmlAttribute(name = "inherited_pgp_email")
    protected String inheritedPgpEmail;

    /**
     * Gets the value of the pgpEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pgpEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPGPEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PgpEmailType }
     * 
     * 
     */
    public List<PgpEmailType> getPGPEmail() {
        if (pgpEmail == null) {
            pgpEmail = new ArrayList<PgpEmailType>();
        }
        return this.pgpEmail;
    }

    /**
     * Gets the value of the inheritedPgpEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritedPgpEmail() {
        return inheritedPgpEmail;
    }

    /**
     * Sets the value of the inheritedPgpEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritedPgpEmail(String value) {
        this.inheritedPgpEmail = value;
    }

}