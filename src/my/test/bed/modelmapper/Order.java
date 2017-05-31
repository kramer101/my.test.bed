package my.test.bed.modelmapper;

/**
 * Created by Vadym_Yakovlev on 5/31/2017.
 */
public class Order {
    private Customer customer;
    private Address billingAddress;




    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(final Address billingAddress) {
        this.billingAddress = billingAddress;
    }

}
