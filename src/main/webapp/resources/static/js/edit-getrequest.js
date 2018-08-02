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

    ajaxGet();

    // // GET REQUEST
    // $("#getAllUserId").click(function(event){
    //     event.preventDefault();
    //     ajaxGet();
    // });

    // DO GET
    function ajaxGet(){

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



        $.ajax({
            type : "GET",
            url :"http://localhost:8080/userEditForm/rest/user/"+id,
            success: function(result){
                $('#getResultDiv ul').empty();
                var usrList = "";
                $.each(result, function(i, user){

                    $("#name").val(user.name);
                    $("#age").val(user.age);
                    $("#address").val(user.address);
                    $("#username").val(user.username);
                    $("#password").val(user.password);


                    //var user = "Id = " + user.user_id + " | Name: " + user.name + " | Age: " + user.age + " | Address: " + user.address + " | Username: " + user.username + " | Password: " + user.password + "<br>";
                    //$('#getResultDiv .list-group').append(user)
                });
                console.log("Success: ", result);
            },
            error : function(e) {
                $("#getResultDiv").html("<strong>Error</strong>");
                console.log("ERROR: ", e);
            }
        });

        setData();
    }

    function setData() {
        $("#name").val("TEST");
        // $("#age").val(user.age);
        // $("#address").val(user.address);
        // $("#username").val(user.username);
        // $("#password").val(user.password);
    }
})

