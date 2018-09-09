package com.zyy.servicehi.service;

import com.zyy.servicehi.dao.ProductInfoRepository;
import com.zyy.servicehi.enums.ProductStatusEnum;
import com.zyy.servicehi.pojo.ProductInfo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/8 17:12
 */
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductServiceImpl implements ProductService {

    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<ProductInfo> findByProductIdIn(List<String> productIdList) {
        return productInfoRepository.findByProductIdIn(productIdList);
    }
}
