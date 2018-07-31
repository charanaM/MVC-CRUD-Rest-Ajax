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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {



    //map home page
    @RequestMapping(value="/")
    public String homepage(){
        return "index";
    }



    //map new user form page
    @RequestMapping(value ="/userForm")
    public String userformPage(){
        return "userForm";
    }



    //map edit user form page
    @RequestMapping(value ="/userEditForm")
    public String usereditformPage(){
        return "userEditForm";
    }

}