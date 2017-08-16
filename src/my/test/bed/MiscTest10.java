package my.test.bed;

import com.fl.wld.xmlbinding.jaxb.profile.ObjectFactory;
import com.fl.wld.xmlbinding.jaxb.profile.Profile;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;

/**
 * Created by Vadym_Yakovlev on 6/27/2017.
 */
public class MiscTest10 {

    public static void main(String[] args) {


        System.out.println(3/2);
        System.out.println(3%2);

        int x = 132;

        x -= (x * 2);
        System.out.println(x);


        try {
            ObjectFactory objectFactory = new ObjectFactory();
            Profile profile = objectFactory.createProfile();
            profile.setAddress(objectFactory.createAddressType());
            profile.getAddress().setCity("New York");

            JAXBContext jaxbContext =
                    JAXBContext.newInstance(Profile.class);

            StringWriter profileXmlBefore = new StringWriter();
            jaxbContext.createMarshaller().marshal(profile, profileXmlBefore);
            Profile profileBefore = (Profile)
                    jaxbContext.createUnmarshaller().unmarshal(new StringReader(profileXmlBefore.toString()));

            profile.getAddress().setCity("Los Angeles");


            System.out.println(profileBefore.getAddress().getCity());
        } catch (Exception eParam) {
            eParam.printStackTrace();
        }
    }







}
