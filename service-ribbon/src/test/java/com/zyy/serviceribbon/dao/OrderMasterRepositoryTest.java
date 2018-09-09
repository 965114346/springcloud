package com.zyy.serviceribbon.dao;

import com.zyy.serviceribbon.pojo.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by yangyang.zhang on 2018/9/8 21:07
 */
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave(){
        OrderMaster master = new OrderMaster();
        master.setOrderId("3456");
        master.setBuyerName("helloworld");
        master.setCreateTime(new Date());
        master.setBuyerPhone("18597804217");
        OrderMaster save = orderMasterRepository.save(master);
        Assert.assertTrue(Objects.isNull(save));
    }

    @Test
    public void testUUID(){
        String str = UUID.randomUUID().toString();
        Assert.assertTrue(str.length() > 0);
    }
}