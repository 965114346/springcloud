package com.zyy.servicehi.dao;

import com.zyy.servicehi.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/8 17:01
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> productCategoryType);
}
