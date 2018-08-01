/*
 *
 *   (C) Copyright 2006-2007 hSenid Software International (Pvt) Limited.
 *   All Rights Reserved.
 *
 *   These materials are unpublished, proprietary, confidential source code of
 *   hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 *   of hSenid Software International (Pvt) Limited.
 *
 *   hSenid Software International (Pvt) Limited retains all title to and intellectual
 *   property rights in these materials.
 *
 *
 */

package com.hms.controller;

import com.hms.model.User;
import com.hms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);



        /**
     * method to get a dummy user
     */
    @RequestMapping(value = UserRestURIConstants.DUMMY_USER, method = RequestMethod.GET)
    public @ResponseBody
    User getDummyUser() {
        logger.info("Start getDummyUser");
        User user = new User();
        user.setUser_id(9999);
        user.setName("Dummy");
        user.setAge("99");
        user.setAddress("99");
        user.setUsername("dummy");
        user.setPassword("dummy");
        return user;
    }




    /**
     * method to get a specific user
     * @param userId
     * @return
     */
    @RequestMapping(value = UserRestURIConstants.GET_USER, method = RequestMethod.GET)
    public @ResponseBody
    User getUser(@PathVariable("id") int userId) {
        logger.info("Start getUser. ID=" + userId);
        return userService.getUserEdit(userId);
    }




    /**
     * method to get all users
     * @return
     */
    @RequestMapping(value = UserRestURIConstants.GET_ALL_USER, method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers() {
        logger.info("Start getAllUsers.");
        return userService.getAllUsers();
    }



    /**
     * method to create new user
     * @param user
     * @return
     */
    @RequestMapping(value = UserRestURIConstants.CREATE_USER, method = RequestMethod.POST)
    public @ResponseBody
    User createUser(@RequestBody User user) {
        logger.info("Start createUser.");
        userService.addUser(user);
        return user;
    }



    /**
     * method to delete a user
     * @param userId
     * @return
     */
    @RequestMapping(value = UserRestURIConstants.DELETE_USER, method = RequestMethod.DELETE)
    public @ResponseBody
    User deleteUser(@PathVariable("id") int userId) {
        logger.info("Start deleteUser.");
        User user = userService.getUser(userId);
        userService.deleteUser(userId);
        return user;
    }



    /**
     * method to update user
     * @param user
     * @param userId
     * @return
     */
    @RequestMapping(value = UserRestURIConstants.UPDATE_USER, method = RequestMethod.PUT)
    public @ResponseBody
    User updateUser(@RequestBody User user, @PathVariable("id") int userId) {
        logger.info("Start createUser.");
        user.setUser_id(userId);
        userService.updateUser(user);
        return user;
    }
}
