package com.zyy.servicehi.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by yangyang.zhang on 2018/9/8 17:58
 */
@Data
public class ProductInfoVo {

    @JSONField(name = "id")
    private String productId;

    @JSONField(name = "name")
    private String productName;

    @JSONField(name = "price")
    private BigDecimal productPrice;

    @JSONField(name = "description")
    private String productDescription;

    @JSONField(name = "icon")
    private String productIcon;
}
