package com.fl.wld.xmlbinding.jaxb.unmarshallers;

import com.fl.wld.xmlbinding.jaxb.profile.Profile;

import javax.xml.bind.*;
import java.io.StringReader;

public class ProfileUnmarshaller implements ValidationEventHandler {
    private String packageName = "com.fl.wld.xmlbinding.jaxb.profile";
    private JAXBContext jaxbContext;
    private Unmarshaller unmarshaller;

    public ProfileUnmarshaller() {
        try {
            createJAXBContext();
            createUnmarshaller();
        } catch (JAXBException e) {
            System.out.println("There has been a problem either creating the context for package '" + packageName + "', creating an unmarshaller or a marshaller for it. Formally, the problem is a " + e);
        }
    }

    private void createJAXBContext() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(com.fl.wld.xmlbinding.jaxb.profile.Profile.class);
    }

    private void createUnmarshaller() throws JAXBException {
        unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setEventHandler(this);
    }

    public boolean handleEvent(ValidationEvent ve) {
        System.out.println("XstoreAPI: IN EVENT HANDLER BLOCK!!!!");
        if (ve.getSeverity() == ValidationEvent.FATAL_ERROR ||
                ve.getSeverity() == ValidationEvent.ERROR) {
            ValidationEventLocator locator = ve.getLocator();
            //Print message from valdation event
            System.out.println("Invalid profile document: "
                    + locator.getURL());
            System.out.println("Error: " + ve.getMessage());
            //Output line and column number
            System.out.println("Error at column " +
                    locator.getColumnNumber() +
                    ", line "
                    + locator.getLineNumber());
            System.out.println("Error element: ");
            if (locator.getNode() != null)
                System.out.println(locator.getNode().getNodeName());
            else
                System.out.println("getNode is NULL");

            if (locator.getObject() != null)
                System.out.println("object: " + locator.getObject().toString());
            else
                System.out.println("getObject is NULL");

            // ignore release_tag formatting errors
            if (locator.getNode().getNodeName().equals("release_tag"))
                return true;
            else
                return false;
        }
        return true;
    }

    public Profile unmarshal(String xmlString) {
        try {
            Profile profile = (Profile) unmarshaller.unmarshal(new StringReader(xmlString));
            return profile;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
