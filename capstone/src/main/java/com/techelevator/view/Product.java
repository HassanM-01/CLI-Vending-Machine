package com.techelevator.view;

public class Product {

    private String itemName;
    private String itemCategory;
    private String itemID;
    private double price;
    private String sound;

    public Product (String itemName, String itemCategory, String itemID, double price ){
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemID = itemID;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public String getItemID() {
        return itemID;
    }

    public double getPrice() {
        return price;
    }


    public String getSound() {
        return toMunch();
    }

    public String toMunch() {

        if(this.itemCategory.equals("Dessert")) {
            this.sound = "Sugar Sugar, so Sweet!";
        } else if(this.itemCategory.equals("Munchy")) {
            this.sound = "Munchy Munchy, so Good!";
        } else if(this.itemCategory.equals("Sandwich")) {
            this.sound = "Sandwich So Delicious, Yum!";
        } else if(this.itemCategory.equals("Drink")) {
            this.sound = "Drinky Drinky, Slurp Slurp!";
        } else {
            this.sound = "Tastes like McGarbage! ";
        }
        return this.sound;
    }
    //add sounds for each type of item crunch crunch, munch munch, etc.


}
