package com.mybatis.hw.custom;

import com.mybatis.hw.custom.entity.Fee;
import com.mybatis.hw.custom.mapper.FeeMapper;
import com.mybatis.hw.custom.mybatis.Executor;
import com.mybatis.hw.custom.mybatis.SqlSession;
import com.mybatis.hw.custom.mybatis.Configuration;

/**
 * @author Administrator
 */
public class MybatisTest {

    public static void main(String[] args) {
        SqlSession sqlSession = new SqlSession(new Configuration(), new Executor());
        FeeMapper mapper = sqlSession.getMapper(FeeMapper.class);
        Fee fee = mapper.queryById(2);
    }

}
