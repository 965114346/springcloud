package com.zyy.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {

    @Override
    public String sayHi(String name) {
        return "sorry "+name+" !";
    }
}
