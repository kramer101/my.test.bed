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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for clerkHistoriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clerkHistoriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClerkHistory" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ch_clerk_name" type="{}string70" minOccurs="0"/>
 *                   &lt;element name="ch_from_year" type="{}digitYearType" minOccurs="0"/>
 *                   &lt;element name="ch_grad_year" type="{}digitYearType" minOccurs="0"/>
 *                   &lt;element name="ch_school_city" type="{}string40" minOccurs="0"/>
 *                   &lt;element name="ch_school_country_code" type="{}digit4" minOccurs="0"/>
 *                   &lt;element name="ch_school_country_desc" type="{}string30" minOccurs="0"/>
 *                   &lt;element name="ch_school_name" type="{}string70" minOccurs="0"/>
 *                   &lt;element name="ch_school_state_code" type="{}digit4" minOccurs="0"/>
 *                   &lt;element name="ch_school_state_abbr" type="{}string3" minOccurs="0"/>
 *                   &lt;element name="ch_to_year" type="{}digitYearType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clerkHistoriesType", propOrder = {
    "clerkHistory"
})
public class ClerkHistoriesType {

    @XmlElement(name = "ClerkHistory", required = true)
    protected List<ClerkHistory> clerkHistory;

    /**
     * Gets the value of the clerkHistory property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clerkHistory property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClerkHistory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClerkHistoriesType.ClerkHistory }
     *
     *
     */
    public List<ClerkHistory> getClerkHistory() {
        if (clerkHistory == null) {
            clerkHistory = new ArrayList<ClerkHistory>();
        }
        return this.clerkHistory;
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
     *         &lt;element name="ch_clerk_name" type="{}string70" minOccurs="0"/>
     *         &lt;element name="ch_from_year" type="{}digitYearType" minOccurs="0"/>
     *         &lt;element name="ch_grad_year" type="{}digitYearType" minOccurs="0"/>
     *         &lt;element name="ch_school_city" type="{}string40" minOccurs="0"/>
     *         &lt;element name="ch_school_country_code" type="{}digit4" minOccurs="0"/>
     *         &lt;element name="ch_school_country_desc" type="{}string30" minOccurs="0"/>
     *         &lt;element name="ch_school_name" type="{}string70" minOccurs="0"/>
     *         &lt;element name="ch_school_state_code" type="{}digit4" minOccurs="0"/>
     *         &lt;element name="ch_school_state_abbr" type="{}string3" minOccurs="0"/>
     *         &lt;element name="ch_to_year" type="{}digitYearType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chClerkName",
        "chFromYear",
        "chGradYear",
        "chSchoolCity",
        "chSchoolCountryCode",
        "chSchoolCountryDesc",
        "chSchoolName",
        "chSchoolStateCode",
        "chSchoolStateAbbr",
        "chToYear"
    })
    public static class ClerkHistory {

        @XmlElement(name = "ch_clerk_name")
        protected String chClerkName;
        @XmlElement(name = "ch_from_year")
        protected String chFromYear;
        @XmlElement(name = "ch_grad_year")
        protected String chGradYear;
        @XmlElement(name = "ch_school_city")
        protected String chSchoolCity;
        @XmlElement(name = "ch_school_country_code")
        protected String chSchoolCountryCode;
        @XmlElement(name = "ch_school_country_desc")
        protected String chSchoolCountryDesc;
        @XmlElement(name = "ch_school_name")
        protected String chSchoolName;
        @XmlElement(name = "ch_school_state_code")
        protected String chSchoolStateCode;
        @XmlElement(name = "ch_school_state_abbr")
        protected String chSchoolStateAbbr;
        @XmlElement(name = "ch_to_year")
        protected String chToYear;

        /**
         * Gets the value of the chClerkName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChClerkName() {
            return chClerkName;
        }

        /**
         * Sets the value of the chClerkName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChClerkName(String value) {
            this.chClerkName = value;
        }

        /**
         * Gets the value of the chFromYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChFromYear() {
            return chFromYear;
        }

        /**
         * Sets the value of the chFromYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChFromYear(String value) {
            this.chFromYear = value;
        }

        /**
         * Gets the value of the chGradYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChGradYear() {
            return chGradYear;
        }

        /**
         * Sets the value of the chGradYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChGradYear(String value) {
            this.chGradYear = value;
        }

        /**
         * Gets the value of the chSchoolCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChSchoolCity() {
            return chSchoolCity;
        }

        /**
         * Sets the value of the chSchoolCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChSchoolCity(String value) {
            this.chSchoolCity = value;
        }

        /**
         * Gets the value of the chSchoolCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChSchoolCountryCode() {
            return chSchoolCountryCode;
        }

        /**
         * Sets the value of the chSchoolCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChSchoolCountryCode(String value) {
            this.chSchoolCountryCode = value;
        }

        /**
         * Gets the value of the chSchoolCountryDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChSchoolCountryDesc() {
            return chSchoolCountryDesc;
        }

        /**
         * Sets the value of the chSchoolCountryDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChSchoolCountryDesc(String value) {
            this.chSchoolCountryDesc = value;
        }

        /**
         * Gets the value of the chSchoolName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChSchoolName() {
            return chSchoolName;
        }

        /**
         * Sets the value of the chSchoolName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChSchoolName(String value) {
            this.chSchoolName = value;
        }

        /**
         * Gets the value of the chSchoolStateCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChSchoolStateCode() {
            return chSchoolStateCode;
        }

        /**
         * Sets the value of the chSchoolStateCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChSchoolStateCode(String value) {
            this.chSchoolStateCode = value;
        }

        /**
         * Gets the value of the chSchoolStateAbbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChSchoolStateAbbr() {
            return chSchoolStateAbbr;
        }

        /**
         * Sets the value of the chSchoolStateAbbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChSchoolStateAbbr(String value) {
            this.chSchoolStateAbbr = value;
        }

        /**
         * Gets the value of the chToYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChToYear() {
            return chToYear;
        }

        /**
         * Sets the value of the chToYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChToYear(String value) {
            this.chToYear = value;
        }

    }

}
