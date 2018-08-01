/*
 * Copyright 2006-2007 hSenid Software International (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Software International (Pvt) Limited.
 *
 * hSenid Software International (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package com.hms.dao;

import com.hms.model.User;

import java.util.List;

/**
 * User data access object
 */

public interface UserDAO {


    /**
     * method to add a new user
     * @param user
     */
    public void addUser(User user);



    /**
     * method to list all the current users
     * @return
     */
    public List<User> getAllUsers();



    /**
     * method to delete a specific user
     * @param userId
     */
    public void deleteUser(Integer userId);



    /**
     * method to update a specific user
     * @param user
     * @return
     */
    public User updateUser(User user);



    /**
     * method to get a specific user for the delete request
     * @param userid
     * @return
     */
    public User getUser(int userid);



    /**
     * method to get a specific user for the put request
     * @param userid
     * @return
     */
    public User getUserEdit(int userid);

}
