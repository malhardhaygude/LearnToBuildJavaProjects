package com.learn.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton inst;

    private StaticBlockSingleton(){}

    static{
        try{
//            int x = 10 / 0;
            inst = new StaticBlockSingleton();
        }catch (Exception e){
            System.out.println("Some exception: "+ e);
        }
    }

    public static StaticBlockSingleton getInst(){
        return inst;
    }
}

