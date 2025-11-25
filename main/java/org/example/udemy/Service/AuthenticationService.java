package org.example.udemy.Service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username,String password){
        boolean isValidUserName = username.equalsIgnoreCase("ayush");
        boolean isValidPassword = password.equalsIgnoreCase("abcd");

        return  isValidUserName && isValidPassword;
    }
}
