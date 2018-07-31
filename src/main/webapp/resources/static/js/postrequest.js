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

    // SUBMIT FORM
    $("#userForm").submit(function(event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
        ajaxPost();
    });




    function ajaxPost(){

        // PREPARE FORM DATA
        var formData = {
            user_id : $("#user_id").val(),
            name : $("#name").val(),
            age : $("#age").val(),
            address : $("#address").val(),
            username : $("#username").val(),
            password : $("#password").val()
        }



        // DO POST
        $.ajax({
            type : "POST",
            contentType : "application/json",
            url : window.location + "/rest/user/create",
            data : JSON.stringify(formData),
            dataType : 'json',
            success : function(result) {
                    $("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" +
                        "Post Successfully! <br>" +
                        "---> User's Info: Name = " +
                        result.data.name + " ,Age = " + result.data.age + " ,Address = " + result.data.address + " ,Username = " + result.data.username + " ,Password = " + result.data.password + " </p>");
                
                console.log(result);
            },
            error : function(e) {
                alert("Error!!")
                console.log("ERROR: ", e);
            }
        });



        // Reset FormData after Posting
        resetData();

    }




    function resetData(){
        $("#name").val("");
        $("#age").val("");
        $("#address").val("");
        $("#username").val("");
        $("#password").val("");
    }
})