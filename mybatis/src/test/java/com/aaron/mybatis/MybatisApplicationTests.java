package com.aaron.mybatis;

import com.aaron.mybatis.entity.Merchant;
import com.aaron.mybatis.enums.BusinessScopeEnum;
import com.aaron.mybatis.service.MerchantService;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Log4j2
@RunWith(SpringRunner.class)
@MapperScan("com.aaron.mybatis.mapper")
@SpringBootTest("application.yml")
public class MybatisApplicationTests {

    @Autowired
    private MerchantService merchantService;

    @Test
    public void testSave() {
        Merchant merchant = new Merchant();
        merchant.setName("北京银行");
        merchant.setAddress("北京市朝阳区");
        List<BusinessScopeEnum> scopes = new ArrayList<>();
        scopes.add(BusinessScopeEnum.PHONE);
        scopes.add(BusinessScopeEnum.TABLET);
        merchant.setScopes(scopes);
        int count = merchantService.save(merchant);
        log.info("save result = {}", count);
    }

    @Test
    public void testQueryAll() {
        List<Merchant> list = merchantService.queryAll();
        log.info("result = {}", list.toString());
    }

    @Test
    public void queryByPrimaryKey() {
        Merchant merchant = merchantService.queryByPrimaryKey(1);
        log.info("queryByPrimaryKey result = {}", merchant);
    }
}
