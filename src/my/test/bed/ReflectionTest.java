package my.test.bed;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vyakovlev on 3/21/17.
 */
public class ReflectionTest {

    private Map<String, Annotation> annotationsMap = new HashMap<>();

    {
        Field[] fields = getClass().getDeclaredFields();

        for (Field f : fields) {

            Annotation annotation = f.getAnnotation(MyAnnotation.class);
            if (annotation != null) {
                annotationsMap.put(f.getName(), annotation);
            }
        }
    }

    @MyAnnotation(name ="name111")

    private String myField1;

    public String getMyField1() {
        return myField1;
    }

    public void setMyField1(String myField1Param) throws Exception {

        this.myField1 = myField1Param;


        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String s = getAnnotationValue(stackTrace);




    }


    private String getAnnotationValue(StackTraceElement[] stackTraceElements) throws Exception {
        String value = null;
        if (stackTraceElements == null || stackTraceElements.length < 2) {
            return value;
        }

        String methodName = "";
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            String currentMethodName = stackTraceElement.getMethodName();
            if (currentMethodName.toLowerCase().startsWith("set")) {
                methodName = currentMethodName;
                break;
            }
        }


        BeanInfo beanInfo = Introspector.getBeanInfo(this.getClass());

        for(PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {
            Method writeMethod = descriptor.getWriteMethod();

            if (writeMethod != null && writeMethod.getName().equals(methodName)) {

                String fieldName = descriptor.getName();
                Annotation annotation = annotationsMap.get(fieldName);
                if (annotation != null && (annotation instanceof MyAnnotation)) {
                    value = ((MyAnnotation) annotation).name();
                }
            }


        }

/*

        for (Method m : getClass().getMethods()) {
            String currentMethodName = m.getName();
            if (currentMethodName.equals(methodName)) {
                Parameter[] parameters = m.getParameters();
                for (Parameter parameter : parameters) {

                    Annotation[] annotations = parameter.getDeclaredAnnotations();
                    for (Annotation a : annotations) {
                        if (a instanceof MyAnnotation) {
                            value = ((MyAnnotation) a).name();
                        }
                    }
                }


               */
/* Annotation[][] paramAnnotationsArray = m.getParameterAnnotations();
                for (Annotation[] paramAnnotations : paramAnnotationsArray) {
                    for (Annotation a : paramAnnotations) {
                        if (a instanceof MyAnnotation) {
                            value = ((MyAnnotation) a).name();
                        }
                    }
                }*//*

            }
        }

*/



        /*MyAnnotation annotation = (MyAnnotation) annotationsMap.get(methodName);
        value = annotation.name();*/
        /*
        Field field = null;
        Field[] fields = getClass().getDeclaredFields();

        for (Field f : fields) {
            if(methodName.toLowerCase().contains(f.getName().toLowerCase())) {
                field = f;
                break;
            }
        }


        Annotation[] annotations = field.getAnnotationsByType(MyAnnotation.class);

        MyAnnotation myAnnotation = (MyAnnotation) annotations[0];

        String annotationNameValue = myAnnotation.name();*/

        return value;
    }


    public static void main(String[] args) throws Exception {


        ReflectionTest test = new ReflectionTest();

        test.setMyField1("some test value");



    }







    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation {

        String name();



    }
}
