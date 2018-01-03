package com.ssm.entity;

public class person {
    private Integer id;

    private String username;

    private String sex;

    private String password;

    public person(Integer id, String username, String sex, String password) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.password = password;
    }

    public person(String username, String sex, String password) {
        this.username = username;
        this.sex = sex;
        this.password = password;
    }

    public person() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}