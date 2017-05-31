package my.test.bed.modelmapper;

/**
 * Created by Vadym_Yakovlev on 5/31/2017.
 */
public class Name {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;
}
