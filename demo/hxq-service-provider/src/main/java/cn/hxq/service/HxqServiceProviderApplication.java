package cn.hxq.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.hxq.service.mapper")//Mapper接口的包扫描
@EnableDiscoveryClient//启用eureka客户端  @EnableEurekaClient 也可
public class HxqServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HxqServiceProviderApplication.class, args);
    }

}
