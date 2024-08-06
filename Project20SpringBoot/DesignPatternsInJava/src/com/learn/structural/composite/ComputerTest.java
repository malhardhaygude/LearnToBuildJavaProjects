package com.learn.structural.composite;

public class ComputerTest {
    public static void main(String[] args) {
        Leaf mouse = new Leaf(239, "Mouse");
        Leaf monitor = new Leaf(10002, "Monitor");
        Leaf hd = new Leaf(2398, "HardDisk");
        Leaf cpu = new Leaf(20000, "CPU");
        Leaf ram = new Leaf(1200, "RAM");

        Composite mb = new Composite("Motherboard");
        Composite cabinet = new Composite("Cabinet");
        Composite peri = new Composite("Peripheral");
        Composite computer = new Composite("Computer");

        computer.addComponent(peri);
        computer.addComponent(cabinet);
        peri.addComponent(mouse);
        peri.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);
        mb.addComponent(ram);
        mb.addComponent(cpu);

//        cabinet.showPrice();
        computer.showPrice();


    }
}
/*
 *
 *
 *                            computer
 *
 *             peri                           cabine
 *
 *       Mouse    Monitor               hd           mother b
 *
 *                                               cpu          ram
 *
 *
 *
 *
 *
 *
 * */