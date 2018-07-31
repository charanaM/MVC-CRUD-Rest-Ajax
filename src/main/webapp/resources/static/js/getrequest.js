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

$( document ).ready(function() {

    // GET REQUEST
    $("#getAllUserId").click(function(event){
        event.preventDefault();
        ajaxGet();
    });

    // DO GET
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : window.location + "/rest/users",
            success: function(result){
                    $('#getResultDiv ul').empty();
                    var usrList = "";
                    $.each(result, function(i, user){
                        var user = "Id = " + user.user_id + " | Name: " + user.name + " | Age: " + user.age + " | Address: " + user.address + " | Username: " + user.username + " | Password: " + user.password + "<br>";
                        $('#getResultDiv .list-group').append(user)
                    });
                    console.log("Success: ", result);
            },
            error : function(e) {
                $("#getResultDiv").html("<strong>Error</strong>");
                console.log("ERROR: ", e);
            }
        });
    }
})