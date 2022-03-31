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
            //starting balance

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
                // add amount to current balance (should be from the cashdrawer file)
            }

            // add a try catch to make sure input was correct




        }


    }




}
