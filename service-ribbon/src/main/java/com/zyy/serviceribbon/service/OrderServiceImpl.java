package com.zyy.serviceribbon.service;

import com.zyy.serviceribbon.Enum.OrderStatusEnum;
import com.zyy.serviceribbon.Enum.PayStatusEnum;
import com.zyy.serviceribbon.dao.OrderDetailRepository;
import com.zyy.serviceribbon.dao.OrderMasterRepository;
import com.zyy.serviceribbon.dto.OrderDTO;
import com.zyy.serviceribbon.pojo.OrderMaster;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by yangyang.zhang on 2018/9/8 23:31
 */
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OrderServiceImpl implements OrderService {

    private OrderDetailRepository orderDetailRepository;

    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        orderDTO.setOrderId(uuid);

        OrderMaster master = new OrderMaster();

        BeanUtils.copyProperties(orderDTO, master);

        master.setOrderAmount(new BigDecimal("5.20"));
        master.setOrderStatus(OrderStatusEnum.NEW.getCode());
        master.setPayStatus(PayStatusEnum.WAIT.getCode());

        orderMasterRepository.save(master);
        return orderDTO;
    }
}
