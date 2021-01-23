package pl.sdacademy.soldier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //wykomentować do testów (aplikacja sie wysypie)
public class AmericanSoldierServiceImpl implements SoldierService {

    public final static String SOLDIER_NAME = "John Rambo";

    @Override
    public String getSoldierName() {
        return SOLDIER_NAME;
    }
}
