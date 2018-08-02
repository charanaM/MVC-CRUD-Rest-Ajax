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

package com.journaldev.spring;

import com.hms.dao.UserDAO;
import com.hms.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class TestSpringRestAjax {

    private static User testUser;
    @Autowired
    private UserDAO userDAO;



    @Test
    public void testaddUser(){
        userDAO.addUser(new User("Test", "10", "aa", "bb", "cc"));
    }

    @Test
    public void testgetAllUsers(){
        Assert.assertTrue(userDAO.getAllUsers().size() > 0);
    }

    @Test
    public void testdeleteUser(){
        userDAO.deleteUser(9);

    }

    @Test
    public void testupdateUser(){
        userDAO.updateUser(new User("Test", "10", "aa", "bb", "cc"));
    }

}
