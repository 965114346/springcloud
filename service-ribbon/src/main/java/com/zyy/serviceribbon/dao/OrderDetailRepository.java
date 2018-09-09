package com.zyy.serviceribbon.dao;

import com.zyy.serviceribbon.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yangyang.zhang on 2018/9/8 21:05
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
