package com.example.nikitamam.Book;


import javax.persistence.*;

@Entity //this tells hibernate to create a table out of this class

//For table in our database

@Table //specifies the name of the database table to be used for mapping

public class Book {
    @Id //specifies the primary key of an entity
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String bookName;
    String author;
    Double price;
    String publication;

    public Book(){

    }
    public Book
            (Integer id, String bookName, String author, Double price, String publication) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.publication = publication;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

}
