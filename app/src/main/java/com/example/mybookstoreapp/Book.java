package com.example.mybookstoreapp;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private String image_url;
    private int price;
    private double rating;
    private String description;

    public Book() {
        // Нужен для Firestore
    }

    public Book(String title, String author, String image_url, int price, double rating, String description) {
        this.title = title;
        this.author = author;
        this.image_url = image_url;
        this.price = price;
        this.rating = rating;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getImageUrl() {
        return image_url;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }
}
