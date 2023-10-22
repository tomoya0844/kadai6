package com.tomoya0844.kadai6;

public class Greet {
    private final String country;
    private final String greet;
    private final String foodCulture;
    private final String recipe;


    public Greet(String country, String greet, String foodCulture, String recipe) {
        this.country = country;
        this.greet = greet;
        this.foodCulture = foodCulture;
        this.recipe = recipe;
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

    public String getRecipe() {
        return recipe;
    }
}


