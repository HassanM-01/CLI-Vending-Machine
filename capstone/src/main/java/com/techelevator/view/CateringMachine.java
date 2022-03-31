package com.techelevator.view;

import java.io.*;
//include the audit printwriter to make a list of transactions
//make sure to add getters for the inventory nd drawer nd menu
//add the sales report method if time permits


public class CateringMachine {

    private Inventory currentInventory = new Inventory();
    private CashDrawer currentDrawer = new CashDrawer();
    private Menu menu = new Menu();

    public Inventory getCurrentInventory() {
        return currentInventory;
    }

    public CashDrawer getCurrentDrawer() {
        return currentDrawer;
    }

    public Menu getMenu() {
        return menu;
    }





}
