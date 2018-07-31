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

package com.hms.dao;

import com.hms.dao.UserDAO;
import com.hms.map.UserMapper;
import com.hms.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


/**
 * implementation of the dao interface.
 *
 */

public class UserDAOSql implements UserDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;



    //set jdbc data source
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }




    //add user query
    @Override
    public void addUser(User user) {
        String addQuery = "INSERT INTO user_info (name, age, address, username, password) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(addQuery, user.getName(), user.getAge(), user.getAddress(), user.getUsername(), user.getPassword());

    }



    //get all users query
    @Override
    public List<User> getAllUsers() {
        String getAllQuery = "SELECT * FROM user_info";
        List<User> users = jdbcTemplate.query(getAllQuery, new UserMapper());
        return users;
    }



    //delete user query
    @Override
    public void deleteUser(Integer userId) {
        String deleteQuery = "DELETE FROM user_info WHERE user_id = ?";
        jdbcTemplate.update(deleteQuery, userId);
    }



    //update user query
    @Override
    public User updateUser(User user) {
        String updateQuery = "UPDATE user_info SET name=?, age=?, address=?, username=?, password=? WHERE user_id=?";
        jdbcTemplate.update(updateQuery, user.getName(), user.getAge(), user.getAddress(), user.getUsername(), user.getPassword(), user.getUser_id());
        return user;
    }



    //get user query
    @Override
    public User getUser(int userId) {
//        String getUserQuery = "SELECT user_id, name, age, address, username, password FROM user_info WHERE user_id = ?";
//        jdbcTemplate.queryForObject(getUserQuery, Object[]{userId}, new UserMapper());
        return null;
    }



    @Override
    public User getUserEdit(int userId) {
        String getUserQuery = "SELECT user_id, name, age, address, username, password FROM user_info WHERE user_id = ?";
        //jdbcTemplate.queryForObject(getUserQuery, userId);
        return null;
    }


}
