package com.aaron.pattern.prototype;

import org.apache.http.impl.client.HttpClientBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class UserTest {

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Aaron");
        user.setPassword("Aaron");

        List<String> roles = new ArrayList<>();
        roles.add("Admin");
        roles.add("Teacher");

        user.setRoles(roles);
        User clone = user.clone();
        clone.getRoles().add("Developer");

        System.out.println("prototype user : " + user.toString());
        System.out.println("clone user : {}" +  clone.toString());
        System.out.println("user == clone : " + (user == clone));
        System.out.println("user.roles == clone.roles : " + (user.getRoles() == clone.getRoles()));
    }
}
