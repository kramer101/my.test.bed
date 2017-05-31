package my.test.bed.modelmapper;

/**
 * Created by Vadym_Yakovlev on 5/31/2017.
 */
public class OrderEntity {
    private String customerFirstName;
    private String customerLastName;
    private String billingStreet;
    private String billingCity;
    private String billingPostalCode;

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(final String billingPostalCodeParam) {
        billingPostalCode = billingPostalCodeParam;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(final String customerFirstNameParam) {
        customerFirstName = customerFirstNameParam;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(final String customerLastNameParam) {
        customerLastName = customerLastNameParam;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(final String billingStreetParam) {
        billingStreet = billingStreetParam;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(final String billingCityParam) {
        billingCity = billingCityParam;
    }
}