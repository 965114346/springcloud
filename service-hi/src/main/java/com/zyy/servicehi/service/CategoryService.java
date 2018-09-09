package com.zyy.servicehi.service;

import com.zyy.servicehi.pojo.ProductCategory;

import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/8 17:50
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> productCategoryType);
}
