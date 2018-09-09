package com.zyy.servicehi.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 商品上下架状态
 * Created by yangyang.zhang on 2018/9/8 17:15
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ProductStatusEnum {

    UP(0, "在架"),DOWN(1, "下架");

    private Integer code;
    private String message;
}
