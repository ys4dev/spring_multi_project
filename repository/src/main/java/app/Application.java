package app;

import app.service.ServiceA;
import app.service.ServiceAImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.main(args);
    }

    @Bean
    public ServiceA serviceA() {
        return new ServiceAImpl();
    }
}
