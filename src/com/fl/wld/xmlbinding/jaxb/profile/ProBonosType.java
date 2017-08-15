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
 * <p>Java class for proBonosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proBonosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProBono" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pro_bono_desc" type="{}string140"/>
 *                   &lt;element name="pro_bono_start_date" type="{}zeroOrMoreDigits" minOccurs="0"/>
 *                   &lt;element name="pro_bono_end_date" type="{}zeroOrMoreDigits" minOccurs="0"/>
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
@XmlType(name = "proBonosType", propOrder = {
    "proBono"
})
public class ProBonosType {

    @XmlElement(name = "ProBono", required = true)
    protected List<ProBono> proBono;

    /**
     * Gets the value of the proBono property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proBono property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProBono().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProBonosType.ProBono }
     *
     *
     */
    public List<ProBono> getProBono() {
        if (proBono == null) {
            proBono = new ArrayList<ProBono>();
        }
        return this.proBono;
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
     *         &lt;element name="pro_bono_desc" type="{}string140"/>
     *         &lt;element name="pro_bono_start_date" type="{}zeroOrMoreDigits" minOccurs="0"/>
     *         &lt;element name="pro_bono_end_date" type="{}zeroOrMoreDigits" minOccurs="0"/>
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
        "proBonoDesc",
        "proBonoStartDate",
        "proBonoEndDate"
    })
    public static class ProBono {

        @XmlElement(name = "pro_bono_desc", required = true)
        protected String proBonoDesc;
        @XmlElement(name = "pro_bono_start_date")
        protected String proBonoStartDate;
        @XmlElement(name = "pro_bono_end_date")
        protected String proBonoEndDate;

        /**
         * Gets the value of the proBonoDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProBonoDesc() {
            return proBonoDesc;
        }

        /**
         * Sets the value of the proBonoDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProBonoDesc(String value) {
            this.proBonoDesc = value;
        }

        /**
         * Gets the value of the proBonoStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProBonoStartDate() {
            return proBonoStartDate;
        }

        /**
         * Sets the value of the proBonoStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProBonoStartDate(String value) {
            this.proBonoStartDate = value;
        }

        /**
         * Gets the value of the proBonoEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProBonoEndDate() {
            return proBonoEndDate;
        }

        /**
         * Sets the value of the proBonoEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProBonoEndDate(String value) {
            this.proBonoEndDate = value;
        }

    }

}