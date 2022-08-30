package com.cydeo.solid.singleResponsibility.example.good;

public class UserController {

    // request to create new account
    public static void getRequest(){
        //Get the request
        //Check who is the person, why tries to make changes => send this request to validation and security part
    }

    public static String createResponse(){
        return "Response";//F.e. "User created"
    }
    public static void sendResponse(){
        //Send response
    }
    // gets request, creates response, sends response. Nothing related to Data base or User Validation


}
