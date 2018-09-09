package com.zyy.servicehi.service;

import com.zyy.servicehi.dao.ProductCategoryRepository;
import com.zyy.servicehi.pojo.ProductCategory;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/8 17:51
 */
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryServiceImpl implements CategoryService {

    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> productCategoryType) {
        return productCategoryRepository.findByCategoryTypeIn(productCategoryType);
    }
}
