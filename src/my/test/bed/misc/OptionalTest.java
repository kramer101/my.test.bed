package my.test.bed.misc;

import java.util.Optional;

public class OptionalTest {


    public static void main(String[] args) {

        getEmployee().ifPresent(employee ->
                employee.getAddress()
                        .ifPresent(address ->
                                System.out.println(address.getStreet())));

    }


    public static Optional<Employee> getEmployee() {

        return Optional.empty();
    }


    private static class Employee {
        private int id;
        private String name;
        private Optional<Address> address;

        public Employee(int id, String name, Optional<Address> address) {

            this.id = id;
            this.name = name;
            this.address = address;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Optional<Address> getAddress() {
            return address;
        }
    }


    private static class Address {
        private String street;
        private String city;
        private String zip;


        public Address(String street, String city, String zip) {
            this.street = street;
            this.city = city;
            this.zip = zip;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getZip() {
            return zip;
        }
    }
}
