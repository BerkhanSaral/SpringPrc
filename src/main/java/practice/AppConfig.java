package practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public Random random() {
        return new Random();
    }
}
