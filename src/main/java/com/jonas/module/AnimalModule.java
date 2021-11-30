package com.jonas.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.jonas.module.domain.Animal;
import com.jonas.module.domain.Cat;
import com.jonas.module.domain.Dog;
import com.jonas.module.domain.SuperDog;

public class AnimalModule extends AbstractModule {

    @Override
    protected void configure() {
        //把Dog绑定给Animal
        bind(Animal.class).to(Dog.class);
        //如果有Super注解则将Animal绑定为SuperDog
        bind(Animal.class).annotatedWith(Super.class).to(SuperDog.class);
        //注解绑定，但不需要创建自定义注解，使用名称区分
        bind(Animal.class).annotatedWith(Names.named("cat")).to(Cat.class);
        //实例绑定
        bind(Integer.class).annotatedWith(Names.named("times")).toInstance(10);
    }
}
