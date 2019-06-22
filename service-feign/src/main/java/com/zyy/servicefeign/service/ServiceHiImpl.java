package com.zyy.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHiImpl implements ServiceHi {

    @Override
    public String sayHi(String name) {
        return "sorry "+name+" !";
    }
}
