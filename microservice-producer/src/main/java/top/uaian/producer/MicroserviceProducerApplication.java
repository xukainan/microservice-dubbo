package top.uaian.producer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.zookeeper.KeeperException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import top.uaian.producer.zookeeper.ZookeeperClient;

import java.io.IOException;

@SpringBootApplication
@EnableDubbo
public class MicroserviceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProducerApplication.class, args);
    }

    @Bean
    public ZookeeperClient getZookeeper() throws IOException, KeeperException, InterruptedException {
        return new ZookeeperClient();
    }

}
