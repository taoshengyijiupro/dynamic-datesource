package com.shipparts.common;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author linyonghong
 * @date 2018.6.4
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

    /**
     * 取得当前使用哪个数据源
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbType();
    }
}
