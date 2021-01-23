package pl.sdacademy.spring_injecting_basics.tank_injecting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdacademy.soldier.SoldierService;

//można użyć @Component zamiast @Service
@Service
public class TankServiceImpl implements TankService {

    @Autowired
    private Tank tank;

    //@Autowired
    //private SoldierService soldierService;

    public Tank getTank() {
        //tank.setSoldierName(soldierService.getSoldierName());
        return tank;
    }

}
