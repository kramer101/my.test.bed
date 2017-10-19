package my.test.bed.epam.interviewing.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * In this example you need to
 * implement a dependency injection for the list of objects.
 *
 */
@Component
public class AutowireListOfObjects {

    @Autowired
    private Set<MyItem> myItems;

    public Set<MyItem> getMyItems() {
        return myItems;
    }

    ////////////////////////////
    private interface MyItem {}
    ////////////////////////////

    @Component
    private class ThingOne implements MyItem {}

    @Component
    private class ThingTwo implements MyItem {}



    public class TestMyItems {
        @Autowired
        private AutowireListOfObjects listOfObjects;

        @Test
        public void testItems() {

        }
    }

}
