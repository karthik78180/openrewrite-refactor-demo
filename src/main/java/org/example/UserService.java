package org.example;

import com.old.Constants.MicroConstant;

public class UserService {
    public void printConstants() {
        System.out.println("App ID: " + MicroConstant.APP_ID);
        System.out.println("Secret: " + MicroConstant.CLIENT_SECRET);
        System.out.println("User: " + MicroConstant.USER_NAME); // Will be renamed to USERNAME
    }
}