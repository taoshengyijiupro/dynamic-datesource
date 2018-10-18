package com.shipparts.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shipparts.common.DBTypeEnum;
import com.shipparts.common.DataSourceSwitch;
import com.shipparts.entity.User;
import com.shipparts.mapper.OrderMapper;
import com.shipparts.mapper.UserMapper;
import com.shipparts.service.db1.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<User> getUserList() {
        return selectList(null);
    }

    @DataSourceSwitch(DBTypeEnum.db1)
    @Override
    public BigDecimal getOrderPriceByUserId(Integer userId) {
        return orderMapper.getPriceByUserId(userId);
    }
}
