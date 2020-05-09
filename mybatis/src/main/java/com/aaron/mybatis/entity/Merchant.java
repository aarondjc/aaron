package com.aaron.mybatis.entity;

import com.aaron.mybatis.enums.BusinessScopeEnum;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Data
@ToString
public class Merchant {

    private Integer id;
    private String name;
    private String address;
    private Date createTime;
    private List<BusinessScopeEnum> scopes;

}
