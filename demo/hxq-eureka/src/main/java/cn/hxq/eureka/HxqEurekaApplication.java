package cn.hxq.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer//启用eureka服务端
public class HxqEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HxqEurekaApplication.class, args);
    }

}
