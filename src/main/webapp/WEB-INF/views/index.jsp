<%--
  ~
  ~   (C) Copyright 2006-2007 hSenid Software International (Pvt) Limited.
  ~   All Rights Reserved.
  ~
  ~   These materials are unpublished, proprietary, confidential source code of
  ~   hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
  ~   of hSenid Software International (Pvt) Limited.
  ~
  ~   hSenid Software International (Pvt) Limited retains all title to and intellectual
  ~   property rights in these materials.
  ~
  ~
  --%>

<%--
  Created by IntelliJ IDEA.
  User: charana
  Date: 7/26/18
  Time: 9:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Boot - AJAX | User Information</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>

    <style>
        .center {
            padding: 40px 0;
            text-align: center;
        }
    </style>

</head>
<body>

<div class="center">

    <h3 style="color:blue; text-align: center;">User Information</h3>
    <br><br>

    <button type="button" onclick="addUser()" class="btn btn-default" style="margin-left:20px; margin-right:5px">Add User</button>

    <br><br>

    <form class="form-inline" style="margin:20px 20px 20px 20px" id="deleteForm">
        <div class="form-group">
            <input type="text" class="form-control" id="delete_id" placeholder="Enter ID" required/>

        <br><br>


        <button type="submit" class="btn btn-default" style="margin-left:20px; margin-right:5px">Delete User</button>
        <button type="button" class="btn btn-default" style="margin-left:20px; margin-right:5px" onclick="editUser()">Edit User</button>

        </div>
    </form>

    <br>

    <div class="center" style="margin:20px 0px 20px 0px">
        <button id="getAllUserId" type="button" class="btn btn-primary">Get All Users</button>
        <div id="getResultDiv" style="padding:20px 10px 20px 50px">
            <ul class="list-group">
            </ul>
        </div>
    </div>

</div>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%--<script src="/resources/static/js/postrequest.js"></script>--%>
<script src="/resources/static/js/getrequest.js"></script>
<script src="/resources/static/js/deleterequest.js"></script>
<script src="/resources/static/js/putrequest.js"></script>

<script>
    var user_id = $("#delete_id").val();

    function addUser() {
        location.href="/userForm";
    }

    function editUser() {
        var id = $("#delete_id").val();

        window.location.href="/userEditForm/?id="+id;
    }
</script>


</body>
</html>
