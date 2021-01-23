package pl.sdacademy.spring_injecting_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
//https://reflectoring.io/spring-component-scanning/


@SpringBootApplication
//@Import(value= {SecretWeapon.class})
@ComponentScan(basePackages = "pl.sdacademy")
public class SpringInjectingBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInjectingBasicsApplication.class, args);
    }

}
