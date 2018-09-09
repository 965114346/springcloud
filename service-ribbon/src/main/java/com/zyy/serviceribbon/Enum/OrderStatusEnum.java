package com.zyy.serviceribbon.Enum;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by yangyang.zhang on 2018/9/8 21:43
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum OrderStatusEnum {
    NEW(0, "新订单"), FINISHED(1, "完结"), CANCEL(2,"取消");

    private Integer code;
    private String msg;
}
