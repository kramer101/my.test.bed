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
 * <p>Java class for membersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="membersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClerkHistory" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{}membersGroup" maxOccurs="unbounded"/>
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
@XmlType(name = "membersType", propOrder = {
    "clerkHistory"
})
public class MembersType {

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
     * {@link MembersType.ClerkHistory }
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
     *         &lt;group ref="{}membersGroup" maxOccurs="unbounded"/>
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
        "membersGroup"
    })
    public static class ClerkHistory {

        @XmlElements({
            @XmlElement(name = "AssocMemberOrg", type = AssocMemberOrgType.class),
            @XmlElement(name = "AssocMemberInd", type = AssocMemberIndType.class)
        })
        protected List<Object> membersGroup;

        /**
         * Gets the value of the membersGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the membersGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMembersGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssocMemberOrgType }
         * {@link AssocMemberIndType }
         * 
         * 
         */
        public List<Object> getMembersGroup() {
            if (membersGroup == null) {
                membersGroup = new ArrayList<Object>();
            }
            return this.membersGroup;
        }

    }

}
