package com.cydeo.solid.singleResponsibility.example.good;

public class Manager {// EACH CLASS HAS IT"S OWN RESPONSIBILITY

    // managing and checking validation

    public static boolean validate(){
        //Check validation
        return true;
    }

    public static boolean checkSecurity(){
        // Send to security related part
        return true;
    }
}
