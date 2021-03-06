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
 * <p>Java class for pastPositionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pastPositionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PastPosition" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="past_pos_emp_name" type="{}string283" minOccurs="0"/>
 *                   &lt;element name="past_pos_title" type="{}string141" minOccurs="0"/>
 *                   &lt;element name="past_pos_start_date" type="{}allDigitsDateType" minOccurs="0"/>
 *                   &lt;element name="past_pos_end_date" type="{}allDigitsDateType" minOccurs="0"/>
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
@XmlType(name = "pastPositionsType", propOrder = {
    "pastPosition"
})
public class PastPositionsType {

    @XmlElement(name = "PastPosition", required = true)
    protected List<PastPosition> pastPosition;

    /**
     * Gets the value of the pastPosition property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pastPosition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPastPosition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PastPositionsType.PastPosition }
     *
     *
     */
    public List<PastPosition> getPastPosition() {
        if (pastPosition == null) {
            pastPosition = new ArrayList<PastPosition>();
        }
        return this.pastPosition;
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
     *         &lt;element name="past_pos_emp_name" type="{}string283" minOccurs="0"/>
     *         &lt;element name="past_pos_title" type="{}string141" minOccurs="0"/>
     *         &lt;element name="past_pos_start_date" type="{}allDigitsDateType" minOccurs="0"/>
     *         &lt;element name="past_pos_end_date" type="{}allDigitsDateType" minOccurs="0"/>
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
        "pastPosEmpName",
        "pastPosTitle",
        "pastPosStartDate",
        "pastPosEndDate"
    })
    public static class PastPosition {

        @XmlElement(name = "past_pos_emp_name")
        protected String pastPosEmpName;
        @XmlElement(name = "past_pos_title")
        protected String pastPosTitle;
        @XmlElement(name = "past_pos_start_date")
        protected String pastPosStartDate;
        @XmlElement(name = "past_pos_end_date")
        protected String pastPosEndDate;

        /**
         * Gets the value of the pastPosEmpName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPastPosEmpName() {
            return pastPosEmpName;
        }

        /**
         * Sets the value of the pastPosEmpName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPastPosEmpName(String value) {
            this.pastPosEmpName = value;
        }

        /**
         * Gets the value of the pastPosTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPastPosTitle() {
            return pastPosTitle;
        }

        /**
         * Sets the value of the pastPosTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPastPosTitle(String value) {
            this.pastPosTitle = value;
        }

        /**
         * Gets the value of the pastPosStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPastPosStartDate() {
            return pastPosStartDate;
        }

        /**
         * Sets the value of the pastPosStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPastPosStartDate(String value) {
            this.pastPosStartDate = value;
        }

        /**
         * Gets the value of the pastPosEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPastPosEndDate() {
            return pastPosEndDate;
        }

        /**
         * Sets the value of the pastPosEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPastPosEndDate(String value) {
            this.pastPosEndDate = value;
        }

    }

}
