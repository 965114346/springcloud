package com.zyy.servicefeign.controller;

import com.zyy.servicefeign.http.HttpAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 基础控制器
 */
@Component
public class BaseController {

    @Autowired
    protected HttpAPIService httpAPIService;
}
