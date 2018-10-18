package com.shipparts.service.db1;



import com.baomidou.mybatisplus.service.IService;
import com.shipparts.entity.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface UserService extends IService<User> {
    List<User> getUserList();

    BigDecimal getOrderPriceByUserId(Integer userId);
}
