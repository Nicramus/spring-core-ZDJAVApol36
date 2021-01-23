package pl.sdacademy.spring_injecting_basics.helicopter_cycle;

import org.springframework.stereotype.Component;

@Component
public class HelicopterBase {

    private Helicopter helicopter;

//commented out - this will cause the cycle!
//    public HelicopterBase(Helicopter helicopter) {
//        this.helicopter = helicopter;
//    }
}
