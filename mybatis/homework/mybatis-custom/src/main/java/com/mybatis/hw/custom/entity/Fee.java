package com.mybatis.hw.custom.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
@ToString
public class Fee {
    private Integer id;
    private Double feeAmt;
    private Date feeDate;

}
