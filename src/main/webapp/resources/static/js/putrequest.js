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
    $("#editForm").submit(function(event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
        ajaxPut();
    });




    function ajaxPut(){

        //method to split url and get the user id
        var getUrlParameter = function getUrlParameter(sParam) {
            var sPageURL = decodeURIComponent(window.location.search.substring(1)),
                sURLVariables = sPageURL.split('&'),
                sParameterName,
                i;
            for (i = 0; i < sURLVariables.length; i++) {
                sParameterName = sURLVariables[i].split('=');
                if (sParameterName[0] === sParam) {
                    return sParameterName[1] === undefined ? true : sParameterName[1];
                }
            }
        };



        var id = getUrlParameter('id');
        // var user_id = $("#delete_id").val();
         console.log("User ID: " +id);
        //var userid = session.getAttribute("userId");



        // PREPARE FORM DATA
        var formData = {
            name : $("#name").val(),
            age : $("#age").val(),
            address : $("#address").val(),
            username : $("#username").val(),
            password : $("#password").val()
        }



        // DO PUT
        $.ajax({
            type : "PUT",
            contentType : "application/json",
            url : "http://localhost:8080/userEditForm/rest/user/update/"+id,
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