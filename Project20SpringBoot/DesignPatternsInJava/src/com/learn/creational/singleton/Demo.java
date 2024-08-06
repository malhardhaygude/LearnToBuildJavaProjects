package com.learn.creational.singleton;

public class Demo {

    public static void main(String[] args) {
        EagerInitializedSingleton obj = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton obj2 = EagerInitializedSingleton.getInstance();
        System.out.println(obj);
        System.out.println(obj2);


        StaticBlockSingleton obj3 = StaticBlockSingleton.getInst();
        StaticBlockSingleton obj4 = StaticBlockSingleton.getInst();
        System.out.println(obj3);
        System.out.println(obj4);

        ThreadSafeSingleton obj5 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton obj6 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton obj7 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println(obj5+" == "+obj6);
        System.out.println(obj5+" == "+obj7);

        BillPughSingleton obj8;
        obj8=BillPughSingleton.getInstance();
    }

}
