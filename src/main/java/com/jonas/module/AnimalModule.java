package com.jonas.module;

import com.google.inject.AbstractModule;
import com.jonas.module.domain.Animal;
import com.jonas.module.domain.Dog;
import com.jonas.module.domain.SuperDog;

public class AnimalModule extends AbstractModule {

    @Override
    protected void configure() {
        //把Dog绑定给Animal
        bind(Animal.class).to(Dog.class);
        //如果有Super注解则将Animal绑定为SuperDog
        bind(Animal.class).annotatedWith(Super.class).to(SuperDog.class);
    }
}
