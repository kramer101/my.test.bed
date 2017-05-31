package my.test.bed.modelmapper;

import org.modelmapper.PropertyMap;

/**
 * Created by Vadym_Yakovlev on 5/31/2017.
 */
public class OrderMapping  {



    public static class OrderEntityToPojoMapping extends PropertyMap<Order, OrderEntity> {
        @Override
        protected void configure() {
            map().setBillingPostalCode(source.getBillingAddress().getZipCode());
        }
    }

    public static class OrderPojoToEntityMapping extends PropertyMap<OrderEntity, Order> {

        @Override
        protected void configure() {
            map().getBillingAddress().setZipCode(source.getBillingPostalCode());
        }
    }


}
