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
 * <p>Java class for flVideoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flVideoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fl_video_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fl_video_tree_group" type="{}flVideoTreeGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fv_lineup_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fv_opt_out" type="{}yesNoFlag" />
 *       &lt;attribute name="fv_sub_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="fv_title_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inherited_fv" type="{}yesNoFlag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flVideoType", propOrder = {
    "flVideoDesc",
    "flVideoTreeGroup"
})
public class FlVideoType {

    @XmlElement(name = "fl_video_desc")
    protected String flVideoDesc;
    @XmlElement(name = "fl_video_tree_group")
    protected List<FlVideoTreeGroupType> flVideoTreeGroup;
    @XmlAttribute(name = "fv_lineup_id")
    protected String fvLineupId;
    @XmlAttribute(name = "fv_opt_out")
    protected String fvOptOut;
    @XmlAttribute(name = "fv_sub_id")
    protected BigInteger fvSubId;
    @XmlAttribute(name = "fv_title_id")
    protected String fvTitleId;
    @XmlAttribute(name = "inherited_fv")
    protected String inheritedFv;

    /**
     * Gets the value of the flVideoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlVideoDesc() {
        return flVideoDesc;
    }

    /**
     * Sets the value of the flVideoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlVideoDesc(String value) {
        this.flVideoDesc = value;
    }

    /**
     * Gets the value of the flVideoTreeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flVideoTreeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlVideoTreeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlVideoTreeGroupType }
     * 
     * 
     */
    public List<FlVideoTreeGroupType> getFlVideoTreeGroup() {
        if (flVideoTreeGroup == null) {
            flVideoTreeGroup = new ArrayList<FlVideoTreeGroupType>();
        }
        return this.flVideoTreeGroup;
    }

    /**
     * Gets the value of the fvLineupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFvLineupId() {
        return fvLineupId;
    }

    /**
     * Sets the value of the fvLineupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFvLineupId(String value) {
        this.fvLineupId = value;
    }

    /**
     * Gets the value of the fvOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFvOptOut() {
        return fvOptOut;
    }

    /**
     * Sets the value of the fvOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFvOptOut(String value) {
        this.fvOptOut = value;
    }

    /**
     * Gets the value of the fvSubId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFvSubId() {
        return fvSubId;
    }

    /**
     * Sets the value of the fvSubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFvSubId(BigInteger value) {
        this.fvSubId = value;
    }

    /**
     * Gets the value of the fvTitleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFvTitleId() {
        return fvTitleId;
    }

    /**
     * Sets the value of the fvTitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFvTitleId(String value) {
        this.fvTitleId = value;
    }

    /**
     * Gets the value of the inheritedFv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritedFv() {
        return inheritedFv;
    }

    /**
     * Sets the value of the inheritedFv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritedFv(String value) {
        this.inheritedFv = value;
    }

}