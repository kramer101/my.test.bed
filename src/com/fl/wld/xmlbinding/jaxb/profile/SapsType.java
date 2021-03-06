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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for sapsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sapsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sap" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sap_material_num" type="{}digit18"/>
 *                   &lt;element name="sap_sales_document" type="{}digit10"/>
 *                   &lt;element name="sap_line_item_num" type="{}digit6"/>
 *                   &lt;element name="sap_quantity" type="{}digit17"/>
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
@XmlType(name = "sapsType", propOrder = {
    "sap"
})
public class SapsType {

    @XmlElement(name = "Sap", required = true)
    protected List<Sap> sap;

    /**
     * Gets the value of the sap property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sap property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSap().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SapsType.Sap }
     *
     *
     */
    public List<Sap> getSap() {
        if (sap == null) {
            sap = new ArrayList<Sap>();
        }
        return this.sap;
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
     *         &lt;element name="sap_material_num" type="{}digit18"/>
     *         &lt;element name="sap_sales_document" type="{}digit10"/>
     *         &lt;element name="sap_line_item_num" type="{}digit6"/>
     *         &lt;element name="sap_quantity" type="{}digit17"/>
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
        "sapMaterialNum",
        "sapSalesDocument",
        "sapLineItemNum",
        "sapQuantity"
    })
    public static class Sap {

        @XmlElement(name = "sap_material_num", required = true)
        protected BigInteger sapMaterialNum;
        @XmlElement(name = "sap_sales_document", required = true)
        protected BigInteger sapSalesDocument;
        @XmlElement(name = "sap_line_item_num", required = true)
        protected BigInteger sapLineItemNum;
        @XmlElement(name = "sap_quantity", required = true)
        protected String sapQuantity;

        /**
         * Gets the value of the sapMaterialNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSapMaterialNum() {
            return sapMaterialNum;
        }

        /**
         * Sets the value of the sapMaterialNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSapMaterialNum(BigInteger value) {
            this.sapMaterialNum = value;
        }

        /**
         * Gets the value of the sapSalesDocument property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSapSalesDocument() {
            return sapSalesDocument;
        }

        /**
         * Sets the value of the sapSalesDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSapSalesDocument(BigInteger value) {
            this.sapSalesDocument = value;
        }

        /**
         * Gets the value of the sapLineItemNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSapLineItemNum() {
            return sapLineItemNum;
        }

        /**
         * Sets the value of the sapLineItemNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSapLineItemNum(BigInteger value) {
            this.sapLineItemNum = value;
        }

        /**
         * Gets the value of the sapQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSapQuantity() {
            return sapQuantity;
        }

        /**
         * Sets the value of the sapQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSapQuantity(String value) {
            this.sapQuantity = value;
        }

    }

}
