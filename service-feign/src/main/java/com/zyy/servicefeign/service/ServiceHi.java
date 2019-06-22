package com.zyy.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = ServiceHiImpl.class)
public interface ServiceHi {

    @GetMapping("/hi")
    String sayHi(@RequestParam("name") String name);
}
