package pl.sdacademy.spring_injecting_basics.tank_injecting;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Tank {

    private String tankName;
    private TankBase base;
    private Turret turret;
    private String soldierName;

    public Tank(@Qualifier("tankBaseWheel") TankBase base, Turret turret) {
        this.base = base;
        this.turret = turret;
        this.tankName = "T-34";
    }

    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }
}
