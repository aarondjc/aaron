package com.aaron.mybatis.handler;

import com.aaron.mybatis.enums.BusinessScopeEnum;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Log4j2
public class ListScopeHandler extends BaseTypeHandler<List<BusinessScopeEnum>> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<BusinessScopeEnum> scopes, JdbcType jdbcType) throws SQLException {
        log.info("setNonNullParameter scopes = {}", scopes.toString());
        if(null == scopes || scopes.isEmpty()) {
            log.info("scopes is empty, no settings required ");
        } else {
            StringBuffer buffer = new StringBuffer();
            scopes.forEach(scope -> {
                buffer.append(scope.getCode()).append(",");
            });
            buffer.substring(0, buffer.length() - 1);
            preparedStatement.setString(i, buffer.toString());
        }

    }

    @Override
    public List<BusinessScopeEnum> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        log.info("getNullableResult callableStatement String s = {}, scope = {}", s, resultSet.getString(s));
        return getScopeList(resultSet.getString(s));
    }

    @Override
    public List<BusinessScopeEnum> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        log.info("getNullableResult resultSet int i = {}, scope = {}", i, resultSet.getString(i));
        return getScopeList(resultSet.getString(i));
    }

    @Override
    public List<BusinessScopeEnum> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        log.info("getNullableResult callableStatement int i = {}, scope = {}", i, callableStatement.getString(i));
        return getScopeList(callableStatement.getString(i));
    }

    private List<BusinessScopeEnum> getScopeList(String result) {
        log.info("result = {}", result);
        if(null == result || "".equals(result.trim())) {
            return new ArrayList<BusinessScopeEnum>();
        } else {
            String[] scopeArray = result.split(",");
            List<BusinessScopeEnum> scopes = new ArrayList<BusinessScopeEnum>();
            for (String code : scopeArray) {
                BusinessScopeEnum scope = BusinessScopeEnum.getByCode(code);
                if (null != scope) {
                    scopes.add(scope);
                }
            }
            return scopes;
        }
    }

}
