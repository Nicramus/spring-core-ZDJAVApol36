package pl.sdacademy.spring_injecting_basics.helicopter_cycle;

import org.springframework.stereotype.Component;

@Component
public class Helicopter {

    private HelicopterBase helicopterBase;
    private Propeller propeller;
    private HelicoperWeapon helicoperWeapon;

    public Helicopter(HelicopterBase helicopterBase, Propeller propeller, HelicoperWeapon helicoperWeapon) {
        this.helicopterBase = helicopterBase;
        this.propeller = propeller;
        this.helicoperWeapon = helicoperWeapon;
    }
}
