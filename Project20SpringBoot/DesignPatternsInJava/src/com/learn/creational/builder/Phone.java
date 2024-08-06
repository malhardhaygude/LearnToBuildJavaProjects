package com.learn.creational.builder;

public class Phone {
   public String os;
   public String processor;
   public double screenSize;
   public int camera;

    public Phone(String os, String processor, double screenSize, int camera) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.camera = camera;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", camera=" + camera +
                '}';
    }
}
