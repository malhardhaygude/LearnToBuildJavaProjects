package com.learn.creational.singleton;

public class BillPughSingleton {
    static{
        System.out.println("BillPughSingleton is loaded");
    }

    private BillPughSingleton(){}

    private static class SingletonHelper{
        static{
            System.out.println("SingletonHelper is loaded");
        }
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
