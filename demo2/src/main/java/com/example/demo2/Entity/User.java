package com.example.demo2.Entity;

import java.util.Date;

public class User {
    private String username;
    private Integer id;
    private Date birthday;
    private String sex;
    private String address;

    public User(String username, Integer id, Date birthday, String sex, String address) {
        super();
        this.username = username;
        this.id = id;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public User() {
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
