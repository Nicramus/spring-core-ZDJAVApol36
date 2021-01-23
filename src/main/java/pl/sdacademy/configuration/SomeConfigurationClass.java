package pl.sdacademy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfigurationClass {

    @Bean
    public String bean1() {
        return "bean1";
    }
}
