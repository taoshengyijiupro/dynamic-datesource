package com.shipparts.mybatis;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.sql.Timestamp;


/**
 * @author linyonghong
 * @date 2018.6.4
 */
public class MyMetaObjectHandler extends MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 更多查看源码测试用例
        System.out.println("*************************");
        System.out.println("insert fill");
        System.out.println("*************************");

        Object createTime = getFieldValByName("createTime", metaObject);//mybatis-plus版本2.0.9+

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (createTime == null) {
            setFieldValByName("createTime", timestamp, metaObject);//mybatis-plus版本2.0.9+
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //更新填充
        System.out.println("*************************");
        System.out.println("update fill");
        System.out.println("*************************");
        //mybatis-plus版本2.0.9+
        setFieldValByName("modifyTime", new Timestamp(System.currentTimeMillis()), metaObject);
    }
}
