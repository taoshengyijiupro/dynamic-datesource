package com.shipparts.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.shipparts.entity.Order;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

/**
 * @author linyonghong
 * @date 2018.6.4
 */
public interface OrderMapper extends BaseMapper<Order>{

    @Select("SELECT price from t_order where user_id =#{userId}")
    BigDecimal getPriceByUserId(Integer userId);
}
