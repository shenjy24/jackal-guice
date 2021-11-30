package com.jonas.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class UserStarter {

    public static void main(String[] args) {
        final Injector injector = Guice.createInjector();
        final UserService userService = injector.getInstance(UserService.class);
        userService.say();
    }
}
