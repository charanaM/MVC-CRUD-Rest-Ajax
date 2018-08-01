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
  Date: 7/30/18
  Time: 10:55 AM
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
            padding: 70px 0;
            text-align: center;
        }
    </style>

</head>
<body>
<div class="center">

    <h3 style="color:blue">Edit User Information</h3>

    <div>
        <form class="form-inline" style="margin:20px 20px 20px 20px" id="editForm">


            <div class="form-group">
                <label for="name" style="margin-left:20px; margin-right:5px">Name:&emsp;&emsp;&emsp;</label>
                <input type="text" class="form-control" id="name" placeholder="Enter Name" required/>
            </div>
            <br>

            <div class="form-group">
                <label for="age" style="margin-left:20px; margin-right:5px">Age:&emsp;&emsp;&emsp;&emsp;</label>
                <input type="text" class="form-control" id="age" placeholder="Enter Age" required/>
            </div>
            <br>


            <div class="form-group">
                <label for="address" style="margin-left:20px; margin-right:5px">Address:&emsp;&emsp;</label>
                <input type="text" class="form-control" id="address" placeholder="Enter Address" required/>
            </div>
            <br>


            <div class="form-group">
                <label for="username" style="margin-left:20px; margin-right:5px">Username:&emsp;</label>
                <input type="text" class="form-control" id="username" placeholder="Enter Username" required/>
            </div>
            <br>


            <div class="form-group">
                <label for="password" style="margin-left:20px; margin-right:5px">Password:&emsp;</label>
                <input type="text" class="form-control" id="password" placeholder="Enter Password" required/>
            </div>
            <br><br>


            <button type="submit" class="btn btn-default" style="margin-left:20px; margin-right:5px">Submit</button>
        </form>
    </div>

    <button type="button" class="btn btn-default" style="margin-left:20px; margin-right:5px" onclick="onHomeClick()">Home Page</button>

    <div class="col-sm-7" id="postResultDiv">
    </div>



</div>


<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="/resources/static/js/putrequest.js"></script>

<script>
    function onHomeClick() {
        location.href="/";

    }
</script>


</body>
</html>
