package pl.sdacademy.spring_injecting_basics.tank_injecting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class TankLogger implements CommandLineRunner {

    private String TAG = "TankLogger";

    @Autowired
    private TankService tankService;

    @Value("${pl.sdacademy.temp: default value}")
    private String path;

    @Value ("${pl.sdacademy.config.tank_names}")
    private List<String> tankNames;

    @Override
    public void run(String... args) throws Exception {
        log.info(TAG + " {}", tankService.getTank());

        log.info(TAG + " {}", tankNames);
    }
}
