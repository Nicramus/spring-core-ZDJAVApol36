package pl.sdacademy.spring_injecting_basics.tank_injecting;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Getter
@Slf4j
public class Weapon {

    Integer weaponSize;

    @PostConstruct
    public void postConstruct() {
        this.weaponSize = 3;
    }

    @PreDestroy
    public void preDestroy() {
        //is fired before bean is destoryed
        log.info("pre-destroy!");
    }
}
