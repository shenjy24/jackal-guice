package com.jonas.module;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class AnimalStarter {

    public static void main(String[] args) {
        final Injector injector = Guice.createInjector(new AnimalModule());
        final AnimalService animalService = injector.getInstance(AnimalService.class);
        animalService.talk();
    }
}
