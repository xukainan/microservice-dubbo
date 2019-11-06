package top.uaian.producer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class MicroserviceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProducerApplication.class, args);
    }

}
