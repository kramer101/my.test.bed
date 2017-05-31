package my.test.bed.modelmapper;

/**
 * Created by Vadym_Yakovlev on 5/31/2017.
 */
public class Address {
    private String street;
    private String city;
    private String zipCode;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(final String zipCodeParam) {
        zipCode = zipCodeParam;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }
}
