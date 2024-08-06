package com.learn.creational.builder;

public class PhoneDemo {

    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        phoneBuilder.setOs("Android");
        phoneBuilder.setCamera(26);
        Phone phone = phoneBuilder.getPhone();
        System.out.println(phone);
    }
}
