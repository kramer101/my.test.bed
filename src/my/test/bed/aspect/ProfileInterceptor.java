package my.test.bed.aspect;

import com.fl.wld.xmlbinding.jaxb.profile.ObjectFactory;
import com.fl.wld.xmlbinding.jaxb.profile.Profile;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * Created by Vadym_Yakovlev on 6/15/2017.
 */
@Aspect
@Component
public class ProfileInterceptor {



    @After(value = "execution(* com.fl.wld.xmlbinding.jaxb.profile.Profile.*(..))")
    @Pointcut
    public void onSetter(final JoinPoint joinPoint) {

        System.out.println("joinPoint:" + joinPoint);
    }


    public static void main(String[] args) {

        ObjectFactory objectFactory = new ObjectFactory();

        Profile p = objectFactory.createProfile();

        p.setAppointments("test value");
        p.setCourt(objectFactory.createCourtType());
    }
}
