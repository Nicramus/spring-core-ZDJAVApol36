package pl.sdacademy.spring_injecting_basics.tank_injecting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TankBaseConfiguration {
    @Bean // metoda ta wstrzykuje zależny bean konieczny do stworzenia beana
    public TankBase tankBaseWheel(final TankBase tankBase) {
        //tankBase.
        return tankBase;
    }
}
