package com.learn.creational.builder;

public class PhoneBuilder {
    public String os;
    public String processor;
    public double screenSize;
    public int camera;


    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return  this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return  this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return  this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return  this;
    }

    public Phone getPhone(){
        return new Phone(os,processor,screenSize,camera);
    }

}
