package com.jonas.demo;

import com.google.inject.Inject;

public class UserService {

    @Inject
    private UserDAO userDAO;

    public void say() {
        userDAO.say();
    }
}
