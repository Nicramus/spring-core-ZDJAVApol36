package pl.sdacademy.spring_injecting_basics.tank_injecting;

import org.springframework.stereotype.Component;

@Component
public class Turret {
    Weapon weapon;

    public Turret(Weapon weapon) {
        this.weapon = weapon;
    }
}
