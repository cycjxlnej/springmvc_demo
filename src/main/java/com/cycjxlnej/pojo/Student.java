package com.cycjxlnej.pojo;

/**
 * @Author chenwei
 * @Date 2023/4/29 4:18 下午
 */
public class Student {
    private String name;
    private String password;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        System.out.println("hhhhh");
    }
    public void logout() {
        System.out.println("hello");
    }
}
