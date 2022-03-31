package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
STOCK hash map with EX> A1, quantity 7
INVENTORY hash map that imports the catering file
make map with slot # and quantity
make map with slot #, price , catagory and name
 */
public class Inventory {

    private static Map<String, Integer> initialInventory = new HashMap<>();  //initializing maps for both the stock w quantity and one with complete item info
    private Map<String, Product> itemMap = new HashMap<>();


    public Inventory() {
        String filePath = "catering.csv";
        File inputFile = new File(filePath);

        initialInventory.put("A1", 7);
        initialInventory.put("A2", 7);
        initialInventory.put("A3", 7);
        initialInventory.put("A4", 7);
        initialInventory.put("B1", 7);
        initialInventory.put("B2", 7);
        initialInventory.put("B3", 7);
        initialInventory.put("B4", 7);
        initialInventory.put("C1", 7);
        initialInventory.put("C2", 7);
        initialInventory.put("C3", 7);
        initialInventory.put("C4", 7);
        initialInventory.put("D1", 7);
        initialInventory.put("D2", 7);
        initialInventory.put("D3", 7);
        initialInventory.put("D4", 7);

        try {
            Scanner fileScanner = new Scanner(inputFile);
            while (fileScanner.hasNextLine()){
                String thisLine = fileScanner.nextLine();
                String[] itemInfo = thisLine.split(",");

                String itemID = itemInfo [0];
                String itemName = itemInfo [1];
                Double itemPrice = Double.parseDouble(itemInfo [2]);
                String itemCategory = itemInfo [3];

                Product currentProduct = new Product (itemName, itemCategory, itemID, itemPrice);

                itemMap.put(itemID, currentProduct);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There was an error with your file");
        }


    }


    public Map<String, Integer> getInitialInventory() {
        return initialInventory;
    }

    public Map<String, Product> getItemMap() {
        return itemMap;
    }




}
