package com.zyy.serviceribbon.controller;

import com.alibaba.fastjson.JSON;
import com.zyy.serviceribbon.dto.ResultVo;
import com.zyy.serviceribbon.feignclient.ProductClient;
import com.zyy.serviceribbon.pojo.ProductInfo;
import com.zyy.serviceribbon.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/8 23:18
 */
@Controller
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OrderController {

    private OrderService orderService;

    //private LoadBalancerClient loadBalancerClient;

    //private RestTemplate restTemplate;

    private ProductClient productClient;

    @GetMapping("/getHello")
    @ResponseBody
    public String getHello(String name){
        String msg = productClient.msg();
        /*
        RestTemplate template = new RestTemplate();
        String str = template.getForObject("http://localhost:8763/hi", String.class);
        log.debug(str);

        ServiceInstance product = loadBalancerClient.choose("PRODUCT");
        String url = String.format("http://%s:%s", product.getHost(), product.getPort()) + "/hi?猪猪";
        String str2 = template.getForObject(url, String.class);
        log.debug(str2);
        */
        //String str2 = restTemplate.getForObject("http://PRODUCT/hi?name=" + name, String.class);
        log.debug(msg);
        return msg;
    }

    @GetMapping("/getProductList")
    @ResponseBody
    public String getProductList(){
        List<ProductInfo> productInfoList = productClient.listForOrder(Arrays.asList("157875227953464068", "164103465734242707"));
        log.debug("response: {}", productInfoList);
        return JSON.toJSONString(productInfoList);
    }
}
