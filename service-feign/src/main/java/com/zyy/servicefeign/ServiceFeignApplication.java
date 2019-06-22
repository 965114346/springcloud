package com.zyy.servicefeign;

import com.zyy.servicefeign.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class ServiceFeignApplication {

    @Autowired
    private ServiceHi serviceHi;

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }

    @GetMapping("/hi")
    public String hi(String name) {
        return serviceHi.sayHi(name);
    }
}
