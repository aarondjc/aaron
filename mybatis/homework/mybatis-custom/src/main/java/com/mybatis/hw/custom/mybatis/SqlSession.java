package com.mybatis.hw.custom.mybatis;

/**
 * @author Administrator
 */
public class SqlSession {

    private Configuration configuration;

    private Executor executor;

    public SqlSession(Configuration configuration, Executor executor){
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statementId, Object parameter){
        // 根据statementId拿到SQL
        String sql = Configuration.sqlMappings.getString(statementId);
        if(null != sql && !"".equals(sql)){
            return executor.query(sql, parameter);
        }
        return null;
    }

    public <T> T getMapper(Class clazz){
        return configuration.getMapper(clazz, this);
    }

}
