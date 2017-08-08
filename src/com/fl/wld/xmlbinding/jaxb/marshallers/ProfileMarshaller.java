package com.fl.wld.xmlbinding.jaxb.marshallers;

import com.fl.wld.xmlbinding.jaxb.profile.Profile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.Writer;

public class ProfileMarshaller {
    private String packageName = "com.fl.wld.xmlbinding.jaxb.profile";
    private JAXBContext jaxbContext;
    private Marshaller marshaller;

    public ProfileMarshaller() {
        try {
            createJAXBContext();
            createMarshaller();
        } catch (JAXBException e) {
            System.out.println("There has been a problem either creating the context for package '" + packageName + "', creating an unmarshaller or a marshaller for it. Formally, the problem is a " + e);
        }
    }

    private void createJAXBContext() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(com.fl.wld.xmlbinding.jaxb.profile.Profile.class);
    }

    private void createMarshaller() throws JAXBException {
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "ASCII");
    }

    public void marshal(Profile profile, Writer writer) throws JAXBException {
        marshaller.marshal(profile, writer);
    }
}
