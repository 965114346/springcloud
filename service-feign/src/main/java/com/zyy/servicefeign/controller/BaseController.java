package com.zyy.servicefeign.controller;

import com.zyy.servicefeign.http.HttpAPIService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础控制器
 */
public class BaseController {

    @Autowired
    protected HttpAPIService httpAPIService;
}
