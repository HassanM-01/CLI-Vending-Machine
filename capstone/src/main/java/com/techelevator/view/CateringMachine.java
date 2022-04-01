package com.techelevator.view;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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


    public void audit (double initialBalance, double newBalance, String type) {
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String dateAndTime = dateTime.format(LocalDateTime.now());
        File auditLog = new File("src/main/audit.txt");
        try(PrintWriter ghostWriter = new PrintWriter(auditLog, String.valueOf(true))){
            if (!auditLog.exists()){
                PrintWriter writer = new PrintWriter("src/main/audit.txt");
            }
            ghostWriter.write(dateAndTime + " " + type + " $" + initialBalance + " $" + newBalance);
        } catch (IOException e) {
            System.out.println("Log not created.");
        }
    }




}
