package com.zyy.servicehi.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/8 17:58
 */
@Data
public class ProductVo {

    @JSONField(name = "name")
    private String categoryName;

    @JSONField(name = "type")
    private Integer categoryType;

    @JSONField(name = "foods")
    private List<ProductInfoVo> productInfoVoList;
}
