/*
 *  Copyright 2006-2007 hSenid Software International (Pvt) Limited.
 *  All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Software International (Pvt) Limited.
 *
 * hSenid Software International (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package com.hms.model;

import java.io.Serializable;

/**
 * persistence layer.
 *
 * @Entity is used to mark this class as an entity bean.
 * @Table is used to specify the table to presist data.
 * @Id is used to specify the identifier property of entity bean.
 * @GeneratedValue is used to specify the primary key generation strategy.
 *
 */

public class User implements Serializable {

    private static final long serialVersionUID = -3465813074586302847L;



    private int user_id;
    private String name;
    private String age;
    private String address;
    private String username;
    private String password;



    public User() {
    }

    public User(String name, String age, String address, String username, String password) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
