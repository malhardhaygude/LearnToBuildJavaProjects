package com.learn.creational.prototype;

public class Book{
     private int bookId;
     private String bookName;

    public Book() {
    }

    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.bookName = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String name) {
        this.bookName = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + bookName + '\'' +
                '}';
    }

}
