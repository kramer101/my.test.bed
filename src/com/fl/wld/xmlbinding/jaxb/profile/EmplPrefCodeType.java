//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.23 at 12:01:59 PM PDT 
//


package com.fl.wld.xmlbinding.jaxb.profile;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for emplPrefCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="emplPrefCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="FG"/>
 *     &lt;enumeration value="JU"/>
 *     &lt;enumeration value="LF"/>
 *     &lt;enumeration value="MF"/>
 *     &lt;enumeration value="PI"/>
 *     &lt;enumeration value="SF"/>
 *     &lt;enumeration value="SL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum EmplPrefCodeType {

    CO,
    FG,
    JU,
    LF,
    MF,
    PI,
    SF,
    SL;

    public String value() {
        return name();
    }

    public static EmplPrefCodeType fromValue(String v) {
        return valueOf(v);
    }

}