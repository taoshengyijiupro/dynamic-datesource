package com.shipparts.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shipparts.entity.Order;
import com.shipparts.mapper.OrderMapper;
import com.shipparts.service.db2.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderList() {
        return selectList(null);
    }

    @Override
    public BigDecimal getOrderPriceByUserId(Integer userId) {
        return orderMapper.getPriceByUserId(userId);
    }
}
