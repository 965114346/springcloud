package com.zyy.serviceribbon;

import com.zyy.serviceribbon.Enum.OrderStatusEnum;
import com.zyy.serviceribbon.Enum.PayStatusEnum;
import com.zyy.serviceribbon.dao.OrderMasterRepository;
import com.zyy.serviceribbon.pojo.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceRibbonApplicationTests {

    @Autowired
    private OrderMasterRepository masterRepository;

    @Test
    public void contextLoads() {
        OrderMaster master = new OrderMaster();
        master.setOrderId("12");
        master.setBuyerName("zyy");
        master.setBuyerPhone("18597804217");
        master.setCreateTime(new Date());
        master.setBuyerAddress("长沙");
        master.setBuyerOpenid("238468469841");
        master.setOrderAmount(new BigDecimal("1.25"));
        master.setOrderStatus(OrderStatusEnum.NEW.getCode());
        master.setPayStatus(PayStatusEnum.WAIT.getCode());
        OrderMaster save = masterRepository.save(master);
        Assert.assertTrue(save != null);
    }

}
