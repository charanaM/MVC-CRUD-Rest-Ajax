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

public class UserRestURIConstants {

    //uri constants to map http requests
    public static final String DUMMY_USER = "/rest/user/dummy";
    public static final String GET_USER = "/rest/user/{id}";
    public static final String GET_ALL_USER = "/rest/users";
    public static final String CREATE_USER = "/userForm/rest/user/create";
    public static final String DELETE_USER = "/rest/user/delete/{id}";
    public static final String UPDATE_USER = "/userEditForm/rest/user/update/{id}";
}
