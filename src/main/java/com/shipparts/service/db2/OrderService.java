package com.shipparts.service.db2;

import com.baomidou.mybatisplus.service.IService;
import com.shipparts.entity.Order;

import java.math.BigDecimal;
import java.util.List;


/**
 * @author linyonghong
 * @date 2018.6.4
 */
public interface OrderService extends IService<Order> {

    List<Order> getOrderList();
    BigDecimal getOrderPriceByUserId(Integer userId);
}
