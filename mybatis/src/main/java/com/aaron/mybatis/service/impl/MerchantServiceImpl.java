package com.aaron.mybatis.service.impl;

import com.aaron.mybatis.entity.Merchant;
import com.aaron.mybatis.mapper.MerchantMapper;
import com.aaron.mybatis.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Transactional(rollbackFor = {RuntimeException.class, Exception.class})
@Service
public class MerchantServiceImpl implements MerchantService {

    private MerchantMapper merchantMapper;

    @Autowired
    public void setMerchantMapper(MerchantMapper mapper) {
        this.merchantMapper = mapper;
    }

    @Override
    public List<Merchant> queryAll() {
        return merchantMapper.queryAll();
    }

    @Override
    public Merchant queryByPrimaryKey(int id) {
        return merchantMapper.queryByPrimaryKey(id);
    }

    @Override
    public int save(Merchant merchant) {
        return merchantMapper.save(merchant);
    }
}
