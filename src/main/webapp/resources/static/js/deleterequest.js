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

    // DELETE FORM
    $("#deleteForm").submit(function(event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
        ajaxDelete();
    });


})

function ajaxDelete(){
    var user_id = $("#delete_id").val();


    $.ajax({

        type : "DELETE",
        contentType : "application/json",
        url : window.location + "/rest/user/delete/"+user_id,
        success: function (result) {
            console.log("Success: " + result);
        },
        error: function (e) {
            console.log("Fail: ");
        }
    });



    $("#delete_id").val("");

}