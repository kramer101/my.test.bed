package my.test.bed.modelmapper;

/**
 * Created by Vadym_Yakovlev on 6/5/2017.
 */
public class MappingTestImpl implements MapperTest<CustomerEntity, Address> {


    @Override
    public void map(final CustomerEntity source, final Address target) {
        System.out.println("mapping from " + source + " to " + target);
        target.setCity("hardcoded test");
    }

    @Override
    public void unMap(final Address source, final CustomerEntity target) {
        System.out.println("Un-mapping from " + source + " to " + target);
    }
}
