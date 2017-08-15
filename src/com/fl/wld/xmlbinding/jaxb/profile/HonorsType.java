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
 * <p>Java class for honorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="honorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Honor" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="honor_desc" type="{}string255"/>
 *                   &lt;element name="honor_start_date" type="{}allDigitsDateType" minOccurs="0"/>
 *                   &lt;element name="honor_end_date" type="{}allDigitsDateType" minOccurs="0"/>
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
@XmlType(name = "honorsType", propOrder = {
    "honor"
})
public class HonorsType {

    @XmlElement(name = "Honor", required = true)
    protected List<Honor> honor;

    /**
     * Gets the value of the honor property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the honor property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHonor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HonorsType.Honor }
     *
     *
     */
    public List<Honor> getHonor() {
        if (honor == null) {
            honor = new ArrayList<Honor>();
        }
        return this.honor;
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
     *         &lt;element name="honor_desc" type="{}string255"/>
     *         &lt;element name="honor_start_date" type="{}allDigitsDateType" minOccurs="0"/>
     *         &lt;element name="honor_end_date" type="{}allDigitsDateType" minOccurs="0"/>
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
        "honorDesc",
        "honorStartDate",
        "honorEndDate"
    })
    public static class Honor {

        @XmlElement(name = "honor_desc", required = true)
        protected String honorDesc;
        @XmlElement(name = "honor_start_date")
        protected String honorStartDate;
        @XmlElement(name = "honor_end_date")
        protected String honorEndDate;

        /**
         * Gets the value of the honorDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHonorDesc() {
            return honorDesc;
        }

        /**
         * Sets the value of the honorDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHonorDesc(String value) {
            this.honorDesc = value;
        }

        /**
         * Gets the value of the honorStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHonorStartDate() {
            return honorStartDate;
        }

        /**
         * Sets the value of the honorStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHonorStartDate(String value) {
            this.honorStartDate = value;
        }

        /**
         * Gets the value of the honorEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHonorEndDate() {
            return honorEndDate;
        }

        /**
         * Sets the value of the honorEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHonorEndDate(String value) {
            this.honorEndDate = value;
        }

    }

}