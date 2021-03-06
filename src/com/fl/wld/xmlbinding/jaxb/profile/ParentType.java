//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.23 at 12:01:59 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for parentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parent_org_name" type="{}orgNameType"/>
 *         &lt;element name="appointed_by" type="{}string70" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="parent_firmsite_url" type="{}string100" />
 *       &lt;attribute name="parent_guid" use="required" type="{}guidType" />
 *       &lt;attribute name="parent_profile_id" use="required" type="{}profileIdType" />
 *       &lt;attribute name="parent_wld_id" use="required" type="{}wldIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parentType", propOrder = {
    "parentOrgName",
    "appointedBy"
})
public class ParentType {

    @XmlElement(name = "parent_org_name", required = true)
    protected String parentOrgName;
    @XmlElement(name = "appointed_by")
    protected String appointedBy;
    @XmlAttribute(name = "parent_firmsite_url")
    protected String parentFirmsiteUrl;
    @XmlAttribute(name = "parent_guid", required = true)
    protected String parentGuid;
    @XmlAttribute(name = "parent_profile_id", required = true)
    protected int parentProfileId;
    @XmlAttribute(name = "parent_wld_id", required = true)
    protected int parentWldId;

    /**
     * Gets the value of the parentOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrgName() {
        return parentOrgName;
    }

    /**
     * Sets the value of the parentOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrgName(String value) {
        this.parentOrgName = value;
    }

    /**
     * Gets the value of the appointedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointedBy() {
        return appointedBy;
    }

    /**
     * Sets the value of the appointedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointedBy(String value) {
        this.appointedBy = value;
    }

    /**
     * Gets the value of the parentFirmsiteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFirmsiteUrl() {
        return parentFirmsiteUrl;
    }

    /**
     * Sets the value of the parentFirmsiteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFirmsiteUrl(String value) {
        this.parentFirmsiteUrl = value;
    }

    /**
     * Gets the value of the parentGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGuid() {
        return parentGuid;
    }

    /**
     * Sets the value of the parentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGuid(String value) {
        this.parentGuid = value;
    }

    /**
     * Gets the value of the parentProfileId property.
     * 
     */
    public int getParentProfileId() {
        return parentProfileId;
    }

    /**
     * Sets the value of the parentProfileId property.
     * 
     */
    public void setParentProfileId(int value) {
        this.parentProfileId = value;
    }

    /**
     * Gets the value of the parentWldId property.
     * 
     */
    public int getParentWldId() {
        return parentWldId;
    }

    /**
     * Sets the value of the parentWldId property.
     * 
     */
    public void setParentWldId(int value) {
        this.parentWldId = value;
    }

}
