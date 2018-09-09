package com.zyy.serviceribbon.dto;

import com.zyy.serviceribbon.pojo.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yangyang.zhang on 2018/9/8 23:24
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}
