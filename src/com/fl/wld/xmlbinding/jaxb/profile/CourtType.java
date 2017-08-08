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
import java.math.BigInteger;


/**
 * <p>Java class for courtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="courtType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level_code" type="{}string2" minOccurs="0"/>
 *         &lt;element name="clerk_name" type="{}string70" minOccurs="0"/>
 *         &lt;element name="clerk_title" type="{}string70" minOccurs="0"/>
 *         &lt;element name="fax_instructions" type="{}string141" minOccurs="0"/>
 *         &lt;element name="ft_clerk" type="{}digit2" minOccurs="0"/>
 *         &lt;element name="pt_clerk" type="{}digit2" minOccurs="0"/>
 *         &lt;element name="office_hour" type="{}string141" minOccurs="0"/>
 *         &lt;element name="venue" type="{}string1064" minOccurs="0"/>
 *         &lt;element name="fed_state_code" type="{}fedStateCodeType" minOccurs="0"/>
 *         &lt;element name="court_normalized_name" type="{}string300" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courtType", propOrder = {
    "levelCode",
    "clerkName",
    "clerkTitle",
    "faxInstructions",
    "ftClerk",
    "ptClerk",
    "officeHour",
    "venue",
    "fedStateCode",
    "courtNormalizedName"
})
public class CourtType {

    @XmlElement(name = "level_code")
    protected String levelCode;
    @XmlElement(name = "clerk_name")
    protected String clerkName;
    @XmlElement(name = "clerk_title")
    protected String clerkTitle;
    @XmlElement(name = "fax_instructions")
    protected String faxInstructions;
    @XmlElement(name = "ft_clerk")
    protected BigInteger ftClerk;
    @XmlElement(name = "pt_clerk")
    protected BigInteger ptClerk;
    @XmlElement(name = "office_hour")
    protected String officeHour;
    protected String venue;
    @XmlElement(name = "fed_state_code")
    protected String fedStateCode;
    @XmlElement(name = "court_normalized_name")
    protected String courtNormalizedName;

    /**
     * Gets the value of the levelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelCode() {
        return levelCode;
    }

    /**
     * Sets the value of the levelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelCode(String value) {
        this.levelCode = value;
    }

    /**
     * Gets the value of the clerkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClerkName() {
        return clerkName;
    }

    /**
     * Sets the value of the clerkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClerkName(String value) {
        this.clerkName = value;
    }

    /**
     * Gets the value of the clerkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClerkTitle() {
        return clerkTitle;
    }

    /**
     * Sets the value of the clerkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClerkTitle(String value) {
        this.clerkTitle = value;
    }

    /**
     * Gets the value of the faxInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxInstructions() {
        return faxInstructions;
    }

    /**
     * Sets the value of the faxInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxInstructions(String value) {
        this.faxInstructions = value;
    }

    /**
     * Gets the value of the ftClerk property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFtClerk() {
        return ftClerk;
    }

    /**
     * Sets the value of the ftClerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFtClerk(BigInteger value) {
        this.ftClerk = value;
    }

    /**
     * Gets the value of the ptClerk property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPtClerk() {
        return ptClerk;
    }

    /**
     * Sets the value of the ptClerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPtClerk(BigInteger value) {
        this.ptClerk = value;
    }

    /**
     * Gets the value of the officeHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeHour() {
        return officeHour;
    }

    /**
     * Sets the value of the officeHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeHour(String value) {
        this.officeHour = value;
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenue(String value) {
        this.venue = value;
    }

    /**
     * Gets the value of the fedStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFedStateCode() {
        return fedStateCode;
    }

    /**
     * Sets the value of the fedStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFedStateCode(String value) {
        this.fedStateCode = value;
    }

    /**
     * Gets the value of the courtNormalizedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtNormalizedName() {
        return courtNormalizedName;
    }

    /**
     * Sets the value of the courtNormalizedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtNormalizedName(String value) {
        this.courtNormalizedName = value;
    }

}
