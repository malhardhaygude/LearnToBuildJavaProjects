package com.learn.creational.prototype;

public class BookDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop b1 = new BookShop();

        b1.setShopName("Shop - 1");
        b1.loadData();

        BookShop b2 = (BookShop)b1.clone();
        b2.setShopName("Shop - 2");

        b1.getBooks().remove(2); // check whether deep or sallow copy..
        System.out.println(b1);
        System.out.println(b2);
    }
}
