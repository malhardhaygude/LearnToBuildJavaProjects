package com.learn.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitializedSingleton obj1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton obj2 = null;

        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                obj2 = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
