package com.aaron.mybatis.service;

import com.aaron.mybatis.entity.Merchant;

import java.util.List;

/**
 * @author Administrator
 */
public interface MerchantService {

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
