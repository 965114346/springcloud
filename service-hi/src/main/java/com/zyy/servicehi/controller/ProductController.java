package com.zyy.servicehi.controller;

import com.zyy.servicehi.pojo.ProductCategory;
import com.zyy.servicehi.pojo.ProductInfo;
import com.zyy.servicehi.service.CategoryService;
import com.zyy.servicehi.service.ProductService;
import com.zyy.servicehi.vo.ProductInfoVo;
import com.zyy.servicehi.vo.ProductVo;
import com.zyy.servicehi.vo.ResultVo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by yangyang.zhang on 2018/9/8 18:04
 */
@Controller
@RequestMapping("/product")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {

    private ProductService productService;

    private CategoryService categoryService;

    @GetMapping("/list")
    @ResponseBody
    public ResultVo list(){
        // 查询所有在架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        // 获取类目列表
        List<Integer> productCategoryType = productInfoList
                .stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        // 从数据库查询类目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(productCategoryType);

        // 构造数据
        List<ProductVo> productVos = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVo productVo = new ProductVo();
            BeanUtils.copyProperties(productCategory, productVo);

            List<ProductInfoVo> productInfoVos = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (Objects.equals(productInfo.getCategoryType(), productCategory.getCategoryType())) {
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo, productInfoVo);
                    productInfoVos.add(productInfoVo);
                }
            }

            productVo.setProductInfoVoList(productInfoVos);
            productVos.add(productVo);
        }

        return ResultVo.success(productVos);
    }

    /**
     * 获取商品列表，给订单服务用的
     * Created by yangyang.zhang on 2018/9/9 21:16
     */
    @PostMapping("/listForOrder")
    @ResponseBody
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList){
        return productService.findByProductIdIn(productIdList);
    }
}
