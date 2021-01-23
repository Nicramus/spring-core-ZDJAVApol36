package pl.sdacademy.spring_injecting_basics.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BeanViewer implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${pl.sdacademy.temp: default value}")
    private String path;

    @Override
    public void run(String... args) throws Exception {
        String[] beanNames = applicationContext.getBeanDefinitionNames();

        for(String beanName: beanNames) {
            log.info("bean name {}", beanName);
        }

        log.info(path);
    }
}
