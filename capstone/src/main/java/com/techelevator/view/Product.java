package com.techelevator.view;

public class Product {

    private String itemName;
    private String itemCategory;
    private String itemID;
    private double price;

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

    //add sounds for each type of item crunch crunch, munch munch, etc.


}
