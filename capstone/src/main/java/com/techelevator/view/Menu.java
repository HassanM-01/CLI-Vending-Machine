package com.techelevator.view;

import com.sun.tools.javac.Main;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/*
1. display main menu
switch statements
if user input is not valid
call cash drawer class to show money avaliable
 */
public class Menu {
    public boolean shouldRun = true;
    public static CateringMachine cateringMachine = new CateringMachine();
    public static void main(String[] args) {
        cateringMachine.getMenu().run();
    }
    public void run() {

        Scanner userInput = new Scanner(System.in);

        while (shouldRun) {

            System.out.println("***************************");      //Display initial user menu
            System.out.println("         Main Menu         ");
            System.out.println("(D) Display catering items");
            System.out.println("(P) Purchase item");
            System.out.println("(E) Exit ");
            System.out.println("***************************");


            System.out.println("Make a selection: ");                //Gather user input
            String userChoice = userInput.nextLine();
            String convertedChoice = userChoice.toUpperCase().trim(); // validate or check userinput


            if (convertedChoice.equals("D")){                            //more validation witch choice conditional statements
                System.out.println(Menu.cateringMachine.getCurrentInventory().printedItems()); //display menu items
            }

            if (convertedChoice.equals("P")){
               purchaseMenu(); //show options to feed (m)oney, (s)elect item, and (f)inish transaction
            }

            if (convertedChoice.equals("E")){
                //exit program and stop running
                shouldRun = false;
                System.out.println("Goodbye!");
                System.exit(1);

            }

            else{
                System.out.println("Invalid choice, try again bozo");

            }

        }
// to-do -- build out
    }

    public void purchaseMenu() {

        Scanner userInput = new Scanner (System.in);

        while (shouldRun) {

            //get current money from drawer class
            double currentAmount = Menu.cateringMachine.getCurrentDrawer().getBalance();
            //starting balance
            double currentBalance = currentAmount;
            System.out.println("*********************");
            System.out.println("****Purchase Menu****");
            System.out.println("(M) Feed Money");
            System.out.println("(S) Select Item");
            System.out.println("(F) Finish Transaction");
            //System.out.println() current money provided
            System.out.println("*********************");
            System.out.println("Time to make a choice. What would you like to do?");
            System.out.println("*********************");
            String choiceInput = userInput.nextLine();

            if (choiceInput.equals("M")){
                System.out.println("Enter the amount would you like to add (Whole number/Integer) ");
                int cashDeposit = 0;
                double initialBalance = currentBalance;

                try {
                    cashDeposit = Integer.parseInt(userInput.nextLine());

                } catch (Exception e) {
                    System.out.println("Please enter: 1, 5, 10, 20");
                }
                if (cashDeposit < 1) {
                    System.out.println("Please enter: 1, 5, 10, 20");
            }
                if (cashDeposit == 1 || cashDeposit == 5 || cashDeposit == 10 || cashDeposit == 20) {
                    Menu.cateringMachine.getCurrentDrawer().addCash(cashDeposit);
                    System.out.println("Deposited: " + cashDeposit);
                    currentAmount = Menu.cateringMachine.getCurrentDrawer().getBalance();
                    System.out.println(currentAmount);
                    //add method to log transaction to audit.txt

                } else {
                    System.out.println("Please enter: 1, 5, 10, 20 ");
                } }
            else if (choiceInput.equals("S")) {
                System.out.println("Which item? ");
                System.out.println(Menu.cateringMachine.getCurrentInventory().printedItems());
                System.out.println("Enter item ID: ");
                String idInput = userInput.nextLine().toUpperCase();

                if (!Menu.cateringMachine.getCurrentInventory().getInitialInventory().containsKey(idInput)) {
                    System.out.println("Not valid item ID, try again.");

                } else {
                    if (!Menu.cateringMachine.getCurrentDrawer().verifyPrice(idInput)) {
                        System.out.println("Not enough money.");
                    } else if (!Menu.cateringMachine.getCurrentInventory().checkInventory(idInput)) {
                        System.out.println("Product is sold out.");
                    }
                }

            }
// add amount to current balance (should be from the cashdrawer file)
            // add a try catch to make sure input was correct




        }


    }




}
