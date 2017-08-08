package my.test.bed.epam.interviewing;



import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vyakovlev on 3/21/17.
 */
public class CustomSortingTest {


    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();


        Patient p0 =
                Builder.instance()
                        .fn("Ann")
                        .ln("Richards")
                        .visit(Instant.now().minus(Duration.ofDays(2))).build();

        Patient p1 =
                Builder.instance()
                        .fn("John")
                        .ln("Smith")
                        .visit(Instant.now().minus(Duration.ofDays(22))).build();

        Patient p2 = Builder.instance()
                .fn("Samantha")
                .ln("Johns")
                .visit(Instant.now().minus(Duration.ofDays(3))).build();


        Patient p3 =
                Builder.instance()
                        .fn("John")
                        .ln("Smith")
                        .visit(Instant.now().minus(Duration.ofDays(13))).build();

        Patient p4 =
                Builder.instance()
                        .fn("Josh")
                        .ln("Smith")
                        .visit(Instant.now().minus(Duration.ofDays(7))).build();

        Patient p5 =
                Builder.instance()
                        .fn("John")
                        .ln("Watson")
                        .visit(Instant.now().minus(Duration.ofDays(7))).build();

        Patient p6 =
                Builder.instance()
                        .fn("Adam")
                        .ln("Teller")
                        .visit(Instant.now().minus(Duration.ofDays(1))).build();


        patients.add(p6);
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);
        patients.add(p4);
        patients.add(p0);
        patients.add(p5);

        Collections.sort(patients);

        patients.forEach(p -> System.out.println(p));

    }



    static class Patient implements Comparable<Patient> {

        private String firstName;
        private String lastName;
        private Instant lastVisit;

        private Patient(Builder builder) {
            firstName = builder.firstName;
            lastName = builder.lastName;
            lastVisit = builder.lastVisit;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Instant getLastVisit() {
            return lastVisit;
        }

        public void setLastVisit(Instant lastVisit) {
            this.lastVisit = lastVisit;
        }

        @Override
        public int compareTo(Patient o) {
            System.out.println(">>>>this :" + this + " the other:" + o);

            int lastName = getLastName().compareTo(o.getLastName());
            int firstName = getFirstName().compareTo(o.getFirstName());
            int lastVisit = o.getLastVisit().compareTo(getLastVisit());

            if (lastName != 0) {
                return  lastName;
            }

            if (firstName != 0) {
                return lastName;
            }

            return  lastVisit;
        }

        @Override
        public String toString() {
            return lastName + ", " + firstName + "; " + lastVisit;
        }
    }

    static class  Builder {
        private String firstName;
        private String lastName;
        private Instant lastVisit;


        Builder fn(String firstName) {

            this.firstName = firstName;
            return this;

        }

        Builder ln(String lastName) {
            this.lastName = lastName;
            return this;

        }

        Builder visit(Instant visit) {
            lastVisit = visit;
            return this;
        }

        Patient build() {
            return  new Patient(this);
        }

        static Builder instance() {
            return new Builder();
        }


    }


}
