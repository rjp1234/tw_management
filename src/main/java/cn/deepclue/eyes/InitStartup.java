package cn.deepclue.eyes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=10)
public class InitStartup implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
    }
}
