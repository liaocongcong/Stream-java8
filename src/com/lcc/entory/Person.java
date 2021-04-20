package com.lcc.entory;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/4/20 11:28
 */
public class Person {

    private String username;

    private Integer salary;

    private Integer age;

    private String users;

    private String address;

    public Person() {
    }

    public Person(String username, Integer salary, Integer age, String users, String address) {
        this.username = username;
        this.salary = salary;
        this.age = age;
        this.users = users;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}