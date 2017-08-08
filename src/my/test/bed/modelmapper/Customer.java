package my.test.bed.modelmapper;

/**
 * Created by Vadym_Yakovlev on 5/31/2017.
 */
public class Customer {


    private Name name;
    private String customerId;



    public Name getName() {
        return name;
    }

    public void setName(final Name name) {
        this.name = name;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(final String customerIdParam) {
        customerId = customerIdParam;
    }


}
