package com.tomoya0844.kadai6;

public class Greet {
    private final String country;
    private final String greet;
    private final String foodCulture;
    private final String url;

    public Greet(String country, String greet, String foodCulture, String url) {
        this.country = country;
        this.greet = greet;
        this.foodCulture = foodCulture;
        this.url = url;
    }


    public String getCountry() {
        return country;
    }

    public String getGreet() {
        return greet;
    }

    public String getFoodCulture() {
        return foodCulture;
    }

    public String getUrl() {
        return url;
    }
}


