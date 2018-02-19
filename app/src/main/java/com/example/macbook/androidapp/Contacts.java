package com.example.macbook.androidapp;



public class Contacts {
    private String name;
    private String userCategory;
    private int socialImage;
    private int userImage;
    private String products;
    private String country;
    private  String email;

    public Contacts(String name, String userCategory, int socialImage, int userImage, String products, String country, String email) {
        this.name = name;
        this.userCategory = userCategory;
        this.socialImage = socialImage;
        this.userImage = userImage;
        this.products = products;
        this.country = country;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public int getSocialImage() {
        return socialImage;
    }

    public int getUserImage() {
        return userImage;
    }

    public String getProducts() {
        return products;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }
}
