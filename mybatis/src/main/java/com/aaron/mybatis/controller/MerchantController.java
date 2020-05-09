package com.aaron.mybatis.controller;

import com.aaron.mybatis.entity.Merchant;
import com.aaron.mybatis.enums.BusinessScopeEnum;
import com.aaron.mybatis.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @GetMapping("queryAll")
    public List<Merchant> queryAll () {
        return merchantService.queryAll();
    }

    @GetMapping("query/{id}")
    public Merchant queryByPrimaryKey (@PathVariable(name = "id") int id ) {
        return merchantService.queryByPrimaryKey(id);
    }

    @GetMapping("save/{name}/{scopes}")
    public int queryByPrimaryKey (@PathVariable(name = "name") String name, @PathVariable(name = "scopes") String scopes) {
        Merchant merchant = new Merchant();
        merchant.setName(name);
        merchant.setAddress("北京市朝阳区");
        if(null != scopes && !scopes.isEmpty()) {
            String[] scopeArr = scopes.split(",");
            List<BusinessScopeEnum> scopeList = new ArrayList<BusinessScopeEnum>();
            for (String code : scopeArr) {
                BusinessScopeEnum scope = BusinessScopeEnum.getByCode(code);
                if (null != scope) {
                    scopeList.add(scope);
                }
            }
            merchant.setScopes(scopeList);
        }

        return merchantService.save(merchant);
    }

}
