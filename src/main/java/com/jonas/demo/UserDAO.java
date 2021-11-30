package com.jonas.demo;

import com.google.inject.Singleton;

@Singleton  // 打上了这个标记说明是单例的，否则Guice每次回返回一个新的对象
public class UserDAO {
    public void say() {
        System.out.println("dao is saying");
    }
}
