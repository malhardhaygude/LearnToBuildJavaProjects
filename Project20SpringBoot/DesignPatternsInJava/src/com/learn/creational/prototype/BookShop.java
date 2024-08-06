package com.learn.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
   private String shopName;
   List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for (int i = 1; i < 11 ; i++) {
            Book b = new Book();
            b.setBookId(100 + i);
            b.setBookName("Book - " + i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();  // shallow copy BookShop
//    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        System.out.println("This clone m is called..");
        BookShop shop = new BookShop();
//        shop.setBooks(this.getBooks()); // here again deep copy of BookShop but not of List<Book>
        for(Book b: this.getBooks()){
            shop.getBooks().add(b); // deep copy of List<Book>
        }
        return shop;
    }
}
