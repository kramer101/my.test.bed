//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.12 at 04:16:50 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for lawInfoContactFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lawInfoContactFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="li_behavior">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="li_behavior_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="li_type">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="li_type_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="li_phone_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="li_phone_ext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="li_callback_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="li_voice">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="li_voice_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="li_language">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="li_language_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="li_mode">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="li_mode_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="li_timezone">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="li_timezone_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="li_call_times">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="li_call_time" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="li_day_of_week" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="li_do_not_call" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="li_end_time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="li_start_time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="li_after_hours">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="li_after_hours_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="inherited_li" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="li_opt_out" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lawInfoContactFormType", propOrder = {
    "liBehavior",
    "liType",
    "liPhoneNumber",
    "liPhoneExt",
    "liCallbackNumber",
    "liVoice",
    "liLanguage",
    "liMode",
    "liTimezone",
    "liCallTimes",
    "liAfterHours"
})
public class LawInfoContactFormType {

    @XmlElement(name = "li_behavior", required = true)
    protected LawInfoContactFormType.LiBehavior liBehavior;
    @XmlElement(name = "li_type", required = true)
    protected LawInfoContactFormType.LiType liType;
    @XmlElement(name = "li_phone_number", required = true)
    protected String liPhoneNumber;
    @XmlElement(name = "li_phone_ext", required = true)
    protected String liPhoneExt;
    @XmlElement(name = "li_callback_number", required = true)
    protected String liCallbackNumber;
    @XmlElement(name = "li_voice", required = true)
    protected LawInfoContactFormType.LiVoice liVoice;
    @XmlElement(name = "li_language", required = true)
    protected LawInfoContactFormType.LiLanguage liLanguage;
    @XmlElement(name = "li_mode", required = true)
    protected LawInfoContactFormType.LiMode liMode;
    @XmlElement(name = "li_timezone", required = true)
    protected LawInfoContactFormType.LiTimezone liTimezone;
    @XmlElement(name = "li_call_times", required = true)
    protected LawInfoContactFormType.LiCallTimes liCallTimes;
    @XmlElement(name = "li_after_hours", required = true)
    protected LawInfoContactFormType.LiAfterHours liAfterHours;
    @XmlAttribute(name = "inherited_li")
    protected String inheritedLi;
    @XmlAttribute(name = "li_opt_out")
    protected String liOptOut;

    /**
     * Gets the value of the liBehavior property.
     *
     * @return
     *     possible object is
     *     {@link LawInfoContactFormType.LiBehavior }
     *
     */
    public LawInfoContactFormType.LiBehavior getLiBehavior() {
        return liBehavior;
    }

    /**
     * Sets the value of the liBehavior property.
     *
     * @param value
     *     allowed object is
     *     {@link LawInfoContactFormType.LiBehavior }
     *
     */
    public void setLiBehavior(LawInfoContactFormType.LiBehavior value) {
        this.liBehavior = value;
    }

    /**
     * Gets the value of the liType property.
     *
     * @return
     *     possible object is
     *     {@link LawInfoContactFormType.LiType }
     *
     */
    public LawInfoContactFormType.LiType getLiType() {
        return liType;
    }

    /**
     * Sets the value of the liType property.
     *
     * @param value
     *     allowed object is
     *     {@link LawInfoContactFormType.LiType }
     *
     */
    public void setLiType(LawInfoContactFormType.LiType value) {
        this.liType = value;
    }

    /**
     * Gets the value of the liPhoneNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiPhoneNumber() {
        return liPhoneNumber;
    }

    /**
     * Sets the value of the liPhoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiPhoneNumber(String value) {
        this.liPhoneNumber = value;
    }

    /**
     * Gets the value of the liPhoneExt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiPhoneExt() {
        return liPhoneExt;
    }

    /**
     * Sets the value of the liPhoneExt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiPhoneExt(String value) {
        this.liPhoneExt = value;
    }

    /**
     * Gets the value of the liCallbackNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiCallbackNumber() {
        return liCallbackNumber;
    }

    /**
     * Sets the value of the liCallbackNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiCallbackNumber(String value) {
        this.liCallbackNumber = value;
    }

    /**
     * Gets the value of the liVoice property.
     *
     * @return
     *     possible object is
     *     {@link LawInfoContactFormType.LiVoice }
     *
     */
    public LawInfoContactFormType.LiVoice getLiVoice() {
        return liVoice;
    }

    /**
     * Sets the value of the liVoice property.
     *
     * @param value
     *     allowed object is
     *     {@link LawInfoContactFormType.LiVoice }
     *
     */
    public void setLiVoice(LawInfoContactFormType.LiVoice value) {
        this.liVoice = value;
    }

    /**
     * Gets the value of the liLanguage property.
     *
     * @return
     *     possible object is
     *     {@link LawInfoContactFormType.LiLanguage }
     *
     */
    public LawInfoContactFormType.LiLanguage getLiLanguage() {
        return liLanguage;
    }

    /**
     * Sets the value of the liLanguage property.
     *
     * @param value
     *     allowed object is
     *     {@link LawInfoContactFormType.LiLanguage }
     *
     */
    public void setLiLanguage(LawInfoContactFormType.LiLanguage value) {
        this.liLanguage = value;
    }

    /**
     * Gets the value of the liMode property.
     *
     * @return
     *     possible object is
     *     {@link LawInfoContactFormType.LiMode }
     *
     */
    public LawInfoContactFormType.LiMode getLiMode() {
        return liMode;
    }

    /**
     * Sets the value of the liMode property.
     *
     * @param value
     *     allowed object is
     *     {@link LawInfoContactFormType.LiMode }
     *
     */
    public void setLiMode(LawInfoContactFormType.LiMode value) {
        this.liMode = value;
    }

    /**
     * Gets the value of the liTimezone property.
     *
     * @return
     *     possible object is
     *     {@link LawInfoContactFormType.LiTimezone }
     *
     */
    public LawInfoContactFormType.LiTimezone getLiTimezone() {
        return liTimezone;
    }

    /**
     * Sets the value of the liTimezone property.
     *
     * @param value
     *     allowed object is
     *     {@link LawInfoContactFormType.LiTimezone }
     *
     */
    public void setLiTimezone(LawInfoContactFormType.LiTimezone value) {
        this.liTimezone = value;
    }

    /**
     * Gets the value of the liCallTimes property.
     *
     * @return
     *     possible object is
     *     {@link LawInfoContactFormType.LiCallTimes }
     *
     */
    public LawInfoContactFormType.LiCallTimes getLiCallTimes() {
        return liCallTimes;
    }

    /**
     * Sets the value of the liCallTimes property.
     *
     * @param value
     *     allowed object is
     *     {@link LawInfoContactFormType.LiCallTimes }
     *
     */
    public void setLiCallTimes(LawInfoContactFormType.LiCallTimes value) {
        this.liCallTimes = value;
    }

    /**
     * Gets the value of the liAfterHours property.
     *
     * @return
     *     possible object is
     *     {@link LawInfoContactFormType.LiAfterHours }
     *
     */
    public LawInfoContactFormType.LiAfterHours getLiAfterHours() {
        return liAfterHours;
    }

    /**
     * Sets the value of the liAfterHours property.
     *
     * @param value
     *     allowed object is
     *     {@link LawInfoContactFormType.LiAfterHours }
     *
     */
    public void setLiAfterHours(LawInfoContactFormType.LiAfterHours value) {
        this.liAfterHours = value;
    }

    /**
     * Gets the value of the inheritedLi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInheritedLi() {
        return inheritedLi;
    }

    /**
     * Sets the value of the inheritedLi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInheritedLi(String value) {
        this.inheritedLi = value;
    }

    /**
     * Gets the value of the liOptOut property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiOptOut() {
        return liOptOut;
    }

    /**
     * Sets the value of the liOptOut property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiOptOut(String value) {
        this.liOptOut = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="li_after_hours_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LiAfterHours {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "li_after_hours_value")
        protected Byte liAfterHoursValue;

        /**
         * Gets the value of the value property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the liAfterHoursValue property.
         *
         * @return
         *     possible object is
         *     {@link Byte }
         *
         */
        public Byte getLiAfterHoursValue() {
            return liAfterHoursValue;
        }

        /**
         * Sets the value of the liAfterHoursValue property.
         *
         * @param value
         *     allowed object is
         *     {@link Byte }
         *
         */
        public void setLiAfterHoursValue(Byte value) {
            this.liAfterHoursValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="li_behavior_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LiBehavior {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "li_behavior_value")
        protected Byte liBehaviorValue;

        /**
         * Gets the value of the value property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the liBehaviorValue property.
         *
         * @return
         *     possible object is
         *     {@link Byte }
         *
         */
        public Byte getLiBehaviorValue() {
            return liBehaviorValue;
        }

        /**
         * Sets the value of the liBehaviorValue property.
         *
         * @param value
         *     allowed object is
         *     {@link Byte }
         *
         */
        public void setLiBehaviorValue(Byte value) {
            this.liBehaviorValue = value;
        }

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
     *         &lt;element name="li_call_time" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="li_day_of_week" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="li_do_not_call" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                 &lt;attribute name="li_end_time" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="li_start_time" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
    @XmlType(name = "", propOrder = {
        "liCallTime"
    })
    public static class LiCallTimes {

        @XmlElement(name = "li_call_time")
        protected List<LiCallTime> liCallTime;

        /**
         * Gets the value of the liCallTime property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the liCallTime property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLiCallTime().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LawInfoContactFormType.LiCallTimes.LiCallTime }
         *
         *
         */
        public List<LiCallTime> getLiCallTime() {
            if (liCallTime == null) {
                liCallTime = new ArrayList<LiCallTime>();
            }
            return this.liCallTime;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="li_day_of_week" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="li_do_not_call" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *       &lt;attribute name="li_end_time" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="li_start_time" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LiCallTime {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "li_day_of_week")
            protected String liDayOfWeek;
            @XmlAttribute(name = "li_do_not_call")
            protected Byte liDoNotCall;
            @XmlAttribute(name = "li_end_time")
            protected String liEndTime;
            @XmlAttribute(name = "li_start_time")
            protected String liStartTime;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the liDayOfWeek property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLiDayOfWeek() {
                return liDayOfWeek;
            }

            /**
             * Sets the value of the liDayOfWeek property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLiDayOfWeek(String value) {
                this.liDayOfWeek = value;
            }

            /**
             * Gets the value of the liDoNotCall property.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getLiDoNotCall() {
                return liDoNotCall;
            }

            /**
             * Sets the value of the liDoNotCall property.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setLiDoNotCall(Byte value) {
                this.liDoNotCall = value;
            }

            /**
             * Gets the value of the liEndTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLiEndTime() {
                return liEndTime;
            }

            /**
             * Sets the value of the liEndTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLiEndTime(String value) {
                this.liEndTime = value;
            }

            /**
             * Gets the value of the liStartTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLiStartTime() {
                return liStartTime;
            }

            /**
             * Sets the value of the liStartTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLiStartTime(String value) {
                this.liStartTime = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="li_language_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LiLanguage {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "li_language_value")
        protected Byte liLanguageValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the liLanguageValue property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getLiLanguageValue() {
            return liLanguageValue;
        }

        /**
         * Sets the value of the liLanguageValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setLiLanguageValue(Byte value) {
            this.liLanguageValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="li_mode_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LiMode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "li_mode_value")
        protected Byte liModeValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the liModeValue property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getLiModeValue() {
            return liModeValue;
        }

        /**
         * Sets the value of the liModeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setLiModeValue(Byte value) {
            this.liModeValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="li_timezone_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LiTimezone {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "li_timezone_value")
        protected Byte liTimezoneValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the liTimezoneValue property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getLiTimezoneValue() {
            return liTimezoneValue;
        }

        /**
         * Sets the value of the liTimezoneValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setLiTimezoneValue(Byte value) {
            this.liTimezoneValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="li_type_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LiType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "li_type_value")
        protected Byte liTypeValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the liTypeValue property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getLiTypeValue() {
            return liTypeValue;
        }

        /**
         * Sets the value of the liTypeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setLiTypeValue(Byte value) {
            this.liTypeValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="li_voice_value" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LiVoice {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "li_voice_value")
        protected Byte liVoiceValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the liVoiceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getLiVoiceValue() {
            return liVoiceValue;
        }

        /**
         * Sets the value of the liVoiceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setLiVoiceValue(Byte value) {
            this.liVoiceValue = value;
        }

    }

}
