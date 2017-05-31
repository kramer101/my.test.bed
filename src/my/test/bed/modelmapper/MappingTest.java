package my.test.bed.modelmapper;

import org.junit.Test;
import org.modelmapper.ModelMapper;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Vadym_Yakovlev on 5/31/2017.
 */
public class MappingTest {


    @Test
    public void testEntityToPojo() {

        PodamFactory factory = new PodamFactoryImpl();
        OrderEntity orderEntity = factory.manufacturePojo(OrderEntity.class);

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new OrderMapping.OrderPojoToEntityMapping());
        Order order = modelMapper.map(orderEntity, Order.class);

        assertNotNull(order);
        assertEquals(orderEntity.getCustomerLastName(), order.getCustomer().getName().getLastName());
        assertEquals(orderEntity.getCustomerFirstName(), order.getCustomer().getName().getFirstName());

        assertEquals(orderEntity.getBillingPostalCode(), order.getBillingAddress().getZipCode());


    }

    @Test
    public void testPojoToEntity() {
        PodamFactory factory = new PodamFactoryImpl();
        Order orderPojo = factory.manufacturePojo(Order.class);

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new OrderMapping.OrderEntityToPojoMapping());

        OrderEntity orderEntity = modelMapper.map(orderPojo, OrderEntity.class);
        assertNotNull(orderEntity);
        assertEquals(orderPojo.getCustomer().getName().getLastName(), orderEntity.getCustomerLastName());

        assertEquals(orderPojo.getBillingAddress().getZipCode(), orderEntity.getBillingPostalCode());
    }
}
