package com.zyy.servicehi.service;

import com.zyy.servicehi.pojo.ProductInfo;

import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/8 17:09
 */
public interface ProductService {

    /**
     * 查询所有在架商品
     * Created by yangyang.zhang on 2018/9/8 17:09
     */
    List<ProductInfo> findUpAll();

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
