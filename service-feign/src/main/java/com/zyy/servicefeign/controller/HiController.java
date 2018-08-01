package com.zyy.servicefeign.controller;

import com.zyy.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HiController extends BaseController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @Value("${wx.LoginApi}")
    private String wxLoginApi;

    @GetMapping("/hi")
    public String sayHi(String name){
        return schedualServiceHi.sayHi(name);
    }

    @GetMapping("/weixin/login")
    @ResponseBody
    public String http(String appid, String secret, String js_code, String grant_type) throws Exception {
        HashMap<String, Object> map = new HashMap<>(4);
        map.put("appid", appid);
        map.put("secret", secret);
        map.put("js_code", js_code);
        map.put("grant_type", grant_type);
        return httpAPIService.doGet(wxLoginApi, map);
    }

}
