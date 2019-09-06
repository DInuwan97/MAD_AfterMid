package com.example.myapplication.Validations;

public class Validations {

    public Validations(){

    }

    public String signUpValidations(String userName,String userEmail,String password,String confirmPassword){

        String msg;

        if(userName == null || userEmail == null || password == null || confirmPassword == null){
            msg = "Fill all the details!!!";
            return msg;
        }else if(password != confirmPassword){
            msg = "Password Mismatching!!!";
            return msg;
        }else{
            msg = "OK";
            return msg;
        }

    }
}
