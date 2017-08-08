package my.test.bed.modelmapper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import static com.google.common.base.Predicates.and;
import static org.reflections.ReflectionUtils.getAllMethods;

/**
 *
 * Created by Vadym_Yakovlev on 6/5/2017.
 */
public class ReflectionsTest {
    private static Set<Class<? extends MapperTest>> mappers = new HashSet<>();
    private static  ObjectFactoryTest objectFactory = new ObjectFactoryTest();


    public static void main(String[] args) throws Exception {

        loadMappers();
        Order o = new Order();
        build(o);
        System.out.println(o);

    }


    private static void build(Object instance) throws Exception {
        Field[] allFields =  instance.getClass().getDeclaredFields();

        Set<Field> selectedFields = new HashSet<>();

        //filter out just the fields of the custom package
        for(Field field : allFields) {
            if (field.getType() != null) { //to filter out primitives
                Package packagee = field.getType().getPackage();
                if (packagee != null) { //to filter out primitives
                    String fieldTypePackageName = packagee.getName();
                    if (fieldTypePackageName.equals(Order.class.getPackage().getName())) {
                        selectedFields.add(field);
                    }
                }
            }
        }

        if (selectedFields.size() == 0) {
            return;
        }

        for (Field field : selectedFields) {
            System.out.println(field.getType());
            Class<? extends MapperTest> mapperClass = getMapper(CustomerEntity.class, field.getType());

            if (mapperClass != null) {
                MapperTest mapperInstance = mapperClass.newInstance();

                Set<Method> getters = ReflectionUtils.getAllMethods(instance.getClass(),
                        ReflectionUtils.withReturnType(field.getType()));

                Set<Method> setters = ReflectionUtils.getAllMethods(instance.getClass(),
                                ReflectionUtils.withParameters(field.getType()));

                Method getter = null;
                Method setter = null;

                Iterator<Method> getterIterator = getters.iterator();
                if (getterIterator.hasNext()) {
                    getter = getters.iterator().next();
                }

                Iterator<Method> setterIterator = setters.iterator();
                if (setterIterator.hasNext()) {
                    setter = setterIterator.next();
                }

                Object fieldValue = null;
                if (getter != null) {
                    fieldValue = getter.invoke(instance);
                }


                if (fieldValue == null && setter != null) {
                    fieldValue = getNewInstanceFromFactory(field);
                    setter.invoke(instance, fieldValue);
                }

                mapperInstance.map(new CustomerEntity(), field.getType().cast(getter.invoke(instance)));

                build(fieldValue);
            }


        }

    }

    private static Object getNewInstanceFromFactory(final Field fieldParam) throws  Exception {
        Set<Method> factoryMethodsForType =
                getAllMethods(
                        ObjectFactoryTest.class,
                        and(ReflectionUtils.withReturnType(fieldParam.getType())));

        if (factoryMethodsForType.size() > 0) {
            if (factoryMethodsForType.iterator().hasNext()) {
                Method creatorMethod = factoryMethodsForType.iterator().next();
                return creatorMethod.invoke(objectFactory);
            }
        }
        return null;
    }


    private static  Class<? extends MapperTest> getMapper(Class<?> target) {

        for (final Class<? extends MapperTest> mapper : mappers) {

            if (mapper.getGenericInterfaces() != null && mapper.getGenericInterfaces().length > 0) {

                Type[] genericsForMapper =
                ((ParameterizedType) mapper.getGenericInterfaces()[0]).getActualTypeArguments();

                if (genericsForMapper != null && genericsForMapper.length > 1) {
                    Type targetType = genericsForMapper[1];

                    if (target.getTypeName().equals(targetType.getTypeName())) {
                        return mapper;
                    }
                }

            }

        }

        return null;

    }


    private static Class<? extends MapperTest> getMapper(Class<?> source, Class<?> target) {

        for (final Class<? extends MapperTest> mapper : mappers) {

            if (mapper.getGenericInterfaces() != null && mapper.getGenericInterfaces().length > 0) {

                Type[] genericsForMapper =
                        ((ParameterizedType) mapper.getGenericInterfaces()[0]).getActualTypeArguments();

                if (genericsForMapper != null && genericsForMapper.length > 1) {
                    Type sourceType = genericsForMapper[0];
                    Type targetType = genericsForMapper[1];

                    if (source.getTypeName().equals(sourceType.getTypeName()) && target.getTypeName().equals(targetType.getTypeName())) {
                        return mapper;
                    }
                }

            }

        }

        return null;

    }

    private static void loadMappers() {

        Reflections reflections = new Reflections("my.test.bed.modelmapper");

        mappers.addAll(reflections.getSubTypesOf(MapperTest.class));
    }
}
