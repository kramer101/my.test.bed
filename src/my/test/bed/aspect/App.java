package my.test.bed.aspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Component;

/**
 *
 * Created by Vadym_Yakovlev on 6/15/2017.
 */
@Configuration
@EnableAspectJAutoProxy
@EnableAutoConfiguration
@Component
@ComponentScan
@EnableLoadTimeWeaving
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
