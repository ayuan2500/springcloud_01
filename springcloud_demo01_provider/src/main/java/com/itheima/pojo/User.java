package com.itheima.pojo;

/***
 * @ClassName User
 * @Description POJO类，提供有参无参构造，get&set方法
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年11月02日 10:33:00
 */
public class User {
    private String name;    //姓名
    private Integer age;    //年龄
    private String username;    //用户名

    //get&set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //无参构造
    public User() {

    }

    //有参构造
    public User(String name, Integer age, String username) {

        this.name = name;
        this.age = age;
        this.username = username;
    }
}
