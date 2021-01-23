package pl.sdacademy.soldier;

import org.springframework.stereotype.Component;

@Component
public class UniversalSoldierImpl implements SoldierService {

    public final static String SOLDIER_NAME = "Jean-Claude Van Damme";

    @Override
    public String getSoldierName() {
        return SOLDIER_NAME;
    }
}
