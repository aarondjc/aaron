package com.mybatis.hw.custom.mapper;

import com.mybatis.hw.custom.entity.Fee;

/**
 * @author Administrator
 */
public interface FeeMapper {

    /**
     * queryById
     * @param id
     * @return
     */
    Fee queryById(Integer id);

}
