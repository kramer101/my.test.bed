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
 * <p>Java class for otherOfficesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherOfficesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherOffice" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="oo_name" type="{}orgNameType"/>
 *                   &lt;element name="oo_office_desc" type="{}string200" minOccurs="0"/>
 *                   &lt;element name="oo_addr" type="{}ooAddrType"/>
 *                   &lt;element name="oo_phone" type="{}string100" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="oo_branch_firmsite_url" type="{}string100" />
 *                 &lt;attribute name="oo_branch_profile_id" type="{}profileIdType" />
 *                 &lt;attribute name="oo_branch_wld_id" type="{}wldIdType" />
 *                 &lt;attribute name="oo_guid" type="{}guidType" />
 *                 &lt;attribute name="oo_main_branch_flag" type="{}yesNoFlag" />
 *                 &lt;attribute name="oo_status_code" type="{}statusCodeType" />
 *                 &lt;attribute name="oo_use_vanity_URL_addr_flag" type="{}yesNoFlag" />
 *                 &lt;attribute name="oo_vanity_URL_addr" type="{}string400" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="oo_user_defined_order" type="{}yesNoFlag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherOfficesType", propOrder = {
    "otherOffice"
})
public class OtherOfficesType {

    @XmlElement(name = "OtherOffice", required = true)
    protected List<OtherOffice> otherOffice;
    @XmlAttribute(name = "oo_user_defined_order")
    protected String ooUserDefinedOrder;

    /**
     * Gets the value of the otherOffice property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherOffice property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherOffice().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherOfficesType.OtherOffice }
     *
     *
     */
    public List<OtherOffice> getOtherOffice() {
        if (otherOffice == null) {
            otherOffice = new ArrayList<OtherOffice>();
        }
        return this.otherOffice;
    }

    /**
     * Gets the value of the ooUserDefinedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOoUserDefinedOrder() {
        return ooUserDefinedOrder;
    }

    /**
     * Sets the value of the ooUserDefinedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOoUserDefinedOrder(String value) {
        this.ooUserDefinedOrder = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="oo_name" type="{}orgNameType"/>
     *         &lt;element name="oo_office_desc" type="{}string200" minOccurs="0"/>
     *         &lt;element name="oo_addr" type="{}ooAddrType"/>
     *         &lt;element name="oo_phone" type="{}string100" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="oo_branch_firmsite_url" type="{}string100" />
     *       &lt;attribute name="oo_branch_profile_id" type="{}profileIdType" />
     *       &lt;attribute name="oo_branch_wld_id" type="{}wldIdType" />
     *       &lt;attribute name="oo_guid" type="{}guidType" />
     *       &lt;attribute name="oo_main_branch_flag" type="{}yesNoFlag" />
     *       &lt;attribute name="oo_status_code" type="{}statusCodeType" />
     *       &lt;attribute name="oo_use_vanity_URL_addr_flag" type="{}yesNoFlag" />
     *       &lt;attribute name="oo_vanity_URL_addr" type="{}string400" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ooName",
        "ooOfficeDesc",
        "ooAddr",
        "ooPhone"
    })
    public static class OtherOffice {

        @XmlElement(name = "oo_name", required = true)
        protected String ooName;
        @XmlElement(name = "oo_office_desc")
        protected String ooOfficeDesc;
        @XmlElement(name = "oo_addr", required = true)
        protected OoAddrType ooAddr;
        @XmlElement(name = "oo_phone")
        protected String ooPhone;
        @XmlAttribute(name = "oo_branch_firmsite_url")
        protected String ooBranchFirmsiteUrl;
        @XmlAttribute(name = "oo_branch_profile_id")
        protected Integer ooBranchProfileId;
        @XmlAttribute(name = "oo_branch_wld_id")
        protected Integer ooBranchWldId;
        @XmlAttribute(name = "oo_guid")
        protected String ooGuid;
        @XmlAttribute(name = "oo_main_branch_flag")
        protected String ooMainBranchFlag;
        @XmlAttribute(name = "oo_status_code")
        protected StatusCodeType ooStatusCode;
        @XmlAttribute(name = "oo_use_vanity_URL_addr_flag")
        protected String ooUseVanityURLAddrFlag;
        @XmlAttribute(name = "oo_vanity_URL_addr")
        protected String ooVanityURLAddr;

        /**
         * Gets the value of the ooName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOoName() {
            return ooName;
        }

        /**
         * Sets the value of the ooName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOoName(String value) {
            this.ooName = value;
        }

        /**
         * Gets the value of the ooOfficeDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOoOfficeDesc() {
            return ooOfficeDesc;
        }

        /**
         * Sets the value of the ooOfficeDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOoOfficeDesc(String value) {
            this.ooOfficeDesc = value;
        }

        /**
         * Gets the value of the ooAddr property.
         * 
         * @return
         *     possible object is
         *     {@link OoAddrType }
         *     
         */
        public OoAddrType getOoAddr() {
            return ooAddr;
        }

        /**
         * Sets the value of the ooAddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link OoAddrType }
         *     
         */
        public void setOoAddr(OoAddrType value) {
            this.ooAddr = value;
        }

        /**
         * Gets the value of the ooPhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOoPhone() {
            return ooPhone;
        }

        /**
         * Sets the value of the ooPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOoPhone(String value) {
            this.ooPhone = value;
        }

        /**
         * Gets the value of the ooBranchFirmsiteUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOoBranchFirmsiteUrl() {
            return ooBranchFirmsiteUrl;
        }

        /**
         * Sets the value of the ooBranchFirmsiteUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOoBranchFirmsiteUrl(String value) {
            this.ooBranchFirmsiteUrl = value;
        }

        /**
         * Gets the value of the ooBranchProfileId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOoBranchProfileId() {
            return ooBranchProfileId;
        }

        /**
         * Sets the value of the ooBranchProfileId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOoBranchProfileId(Integer value) {
            this.ooBranchProfileId = value;
        }

        /**
         * Gets the value of the ooBranchWldId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOoBranchWldId() {
            return ooBranchWldId;
        }

        /**
         * Sets the value of the ooBranchWldId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOoBranchWldId(Integer value) {
            this.ooBranchWldId = value;
        }

        /**
         * Gets the value of the ooGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOoGuid() {
            return ooGuid;
        }

        /**
         * Sets the value of the ooGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOoGuid(String value) {
            this.ooGuid = value;
        }

        /**
         * Gets the value of the ooMainBranchFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOoMainBranchFlag() {
            return ooMainBranchFlag;
        }

        /**
         * Sets the value of the ooMainBranchFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOoMainBranchFlag(String value) {
            this.ooMainBranchFlag = value;
        }

        /**
         * Gets the value of the ooStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link StatusCodeType }
         *     
         */
        public StatusCodeType getOoStatusCode() {
            return ooStatusCode;
        }

        /**
         * Sets the value of the ooStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusCodeType }
         *     
         */
        public void setOoStatusCode(StatusCodeType value) {
            this.ooStatusCode = value;
        }

        /**
         * Gets the value of the ooUseVanityURLAddrFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOoUseVanityURLAddrFlag() {
            return ooUseVanityURLAddrFlag;
        }

        /**
         * Sets the value of the ooUseVanityURLAddrFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOoUseVanityURLAddrFlag(String value) {
            this.ooUseVanityURLAddrFlag = value;
        }

        /**
         * Gets the value of the ooVanityURLAddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOoVanityURLAddr() {
            return ooVanityURLAddr;
        }

        /**
         * Sets the value of the ooVanityURLAddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOoVanityURLAddr(String value) {
            this.ooVanityURLAddr = value;
        }

    }

}
