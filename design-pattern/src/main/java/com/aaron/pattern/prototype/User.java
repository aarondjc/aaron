package com.aaron.pattern.prototype;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 */
@Data
public class User implements Cloneable, Serializable {
    private String username;
    private String password;
    private List<String> roles;
    @Override
    public User clone() {
        return JSON.parseObject(JSON.toJSONString(this), User.class);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
