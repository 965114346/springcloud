package com.zyy.serviceribbon.feignclient;

import com.zyy.serviceribbon.pojo.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/9 21:04
 */
@FeignClient(name = "PRODUCT")
public interface ProductClient {

    @GetMapping("/hi")
    String msg();

    @PostMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);
}
