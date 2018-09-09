package com.zyy.serviceribbon.Enum;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by yangyang.zhang on 2018/9/8 21:43
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum PayStatusEnum {
    WAIT(0, "等待支付"), SUCCESS(1, "支付成功");

    private Integer code;
    private String msg;
}
