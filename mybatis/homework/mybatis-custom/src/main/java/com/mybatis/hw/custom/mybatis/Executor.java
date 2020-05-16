package com.mybatis.hw.custom.mybatis;

import com.mybatis.hw.custom.entity.Fee;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Date;

/**
 * @author Administrator
 */
public class Executor {

    public <T> T query(String sql, Object parameter) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Fee fee = new Fee();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            sql = String.format(sql, parameter);
            System.out.println("sql = " + sql);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gupao?serverTimezone=PRC", "root", "123456");


            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            // 获取&遍历结果集
            // 获取结果集
            while (resultSet.next()) {
                fee.setId(resultSet.getInt("id"));
                fee.setFeeAmt(resultSet.getDouble("fee_amt"));
                fee.setFeeDate(resultSet.getDate("fee_date"));
            }
            System.out.println(fee);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
            }
        }
        return (T)fee;

    }

}
