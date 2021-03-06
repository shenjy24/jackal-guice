package com.jonas.module;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.jonas.module.domain.Animal;

public class AnimalService {
    @Inject
    private Animal dog;

    @Inject
    @Super  //打上了@Super注解，Guice在注入的时候会根据在Module里面配置的绑定关系注入对应的实现类
    private Animal superDog;

    @Inject
    @Named("cat")
    private Animal cat;

    //实例绑定
    @Inject
    @Named("times")
    private int times;

    public void talk() {
        System.out.println("dog will talk");
        dog.talk();
        System.out.println("super will talk");
        superDog.talk();
        System.out.println("cat will talk");
        cat.talk();
        System.out.println("times is :" + times);
    }
}
