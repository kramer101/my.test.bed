//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.23 at 12:01:59 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for lsAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lsAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LS_addr_line" type="{}string70" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="LS_city" type="{}string40" minOccurs="0"/>
 *         &lt;element name="LS_zip" type="{}zipType" minOccurs="0"/>
 *         &lt;element name="LS_zip4" type="{}zip4Type" minOccurs="0"/>
 *         &lt;element name="LS_postal_code_prefix" type="{}string15" minOccurs="0"/>
 *         &lt;element name="LS_postal_code_suffix" type="{}string15" minOccurs="0"/>
 *         &lt;element name="LS_county" type="{}string20" minOccurs="0"/>
 *         &lt;element name="LS_state" type="{}lsStateType" minOccurs="0"/>
 *         &lt;element name="LS_country" type="{}lsCountryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LS_Address_seq_num" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lsAddressType", propOrder = {
    "lsAddrLine",
    "lsCity",
    "lsZip",
    "lsZip4",
    "lsPostalCodePrefix",
    "lsPostalCodeSuffix",
    "lsCounty",
    "lsState",
    "lsCountry"
})
public class LsAddressType {

    @XmlElement(name = "LS_addr_line")
    protected List<String> lsAddrLine;
    @XmlElement(name = "LS_city")
    protected String lsCity;
    @XmlElement(name = "LS_zip")
    protected String lsZip;
    @XmlElement(name = "LS_zip4")
    protected String lsZip4;
    @XmlElement(name = "LS_postal_code_prefix")
    protected String lsPostalCodePrefix;
    @XmlElement(name = "LS_postal_code_suffix")
    protected String lsPostalCodeSuffix;
    @XmlElement(name = "LS_county")
    protected String lsCounty;
    @XmlElement(name = "LS_state")
    protected LsStateType lsState;
    @XmlElement(name = "LS_country")
    protected LsCountryType lsCountry;
    @XmlAttribute(name = "LS_Address_seq_num")
    protected BigInteger lsAddressSeqNum;

    /**
     * Gets the value of the lsAddrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lsAddrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLSAddrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLSAddrLine() {
        if (lsAddrLine == null) {
            lsAddrLine = new ArrayList<String>();
        }
        return this.lsAddrLine;
    }

    /**
     * Gets the value of the lsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSCity() {
        return lsCity;
    }

    /**
     * Sets the value of the lsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSCity(String value) {
        this.lsCity = value;
    }

    /**
     * Gets the value of the lsZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSZip() {
        return lsZip;
    }

    /**
     * Sets the value of the lsZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSZip(String value) {
        this.lsZip = value;
    }

    /**
     * Gets the value of the lsZip4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSZip4() {
        return lsZip4;
    }

    /**
     * Sets the value of the lsZip4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSZip4(String value) {
        this.lsZip4 = value;
    }

    /**
     * Gets the value of the lsPostalCodePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSPostalCodePrefix() {
        return lsPostalCodePrefix;
    }

    /**
     * Sets the value of the lsPostalCodePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSPostalCodePrefix(String value) {
        this.lsPostalCodePrefix = value;
    }

    /**
     * Gets the value of the lsPostalCodeSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSPostalCodeSuffix() {
        return lsPostalCodeSuffix;
    }

    /**
     * Sets the value of the lsPostalCodeSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSPostalCodeSuffix(String value) {
        this.lsPostalCodeSuffix = value;
    }

    /**
     * Gets the value of the lsCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSCounty() {
        return lsCounty;
    }

    /**
     * Sets the value of the lsCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSCounty(String value) {
        this.lsCounty = value;
    }

    /**
     * Gets the value of the lsState property.
     * 
     * @return
     *     possible object is
     *     {@link LsStateType }
     *     
     */
    public LsStateType getLSState() {
        return lsState;
    }

    /**
     * Sets the value of the lsState property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsStateType }
     *     
     */
    public void setLSState(LsStateType value) {
        this.lsState = value;
    }

    /**
     * Gets the value of the lsCountry property.
     * 
     * @return
     *     possible object is
     *     {@link LsCountryType }
     *     
     */
    public LsCountryType getLSCountry() {
        return lsCountry;
    }

    /**
     * Sets the value of the lsCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsCountryType }
     *     
     */
    public void setLSCountry(LsCountryType value) {
        this.lsCountry = value;
    }

    /**
     * Gets the value of the lsAddressSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLSAddressSeqNum() {
        return lsAddressSeqNum;
    }

    /**
     * Sets the value of the lsAddressSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLSAddressSeqNum(BigInteger value) {
        this.lsAddressSeqNum = value;
    }

}