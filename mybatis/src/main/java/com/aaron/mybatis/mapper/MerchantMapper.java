package com.aaron.mybatis.mapper;

import com.aaron.mybatis.entity.Merchant;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
public interface MerchantMapper {

    /**
     * select All Merchant
     * @return
     */
    List<Merchant> queryAll();

    /**
     * select Merchant By PrimaryKey
     * @param id
     * @return
     */
    Merchant queryByPrimaryKey(int id);

    /**
     * save Merchant
     * @param merchant
     * @return
     */
    int save(Merchant merchant);
}
