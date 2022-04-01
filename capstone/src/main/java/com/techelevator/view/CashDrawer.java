package com.techelevator.view;
/*
set double balance == 0.00
returns balance
input current money if 1 5 10 20
subtract if the have enough money for product

method for making change

 */
public class CashDrawer {

    private double balance = 0.00;

    public CashDrawer() {}

    public void addCash(double input) {   //add deposit method
        if (input > 0) {
            this.balance += input;
        }
    }
    public boolean verifyPrice(String itemID){    //checks if the item selected costs less than the balance available
        double price = Menu.cateringMachine.getCurrentInventory().getItemPrice(itemID);
        return price <= balance;
    }

    public void deductPrice(double price) {         //subtract cost of the item from the balance
        this.balance -= price;
    }
    public double getBalance(){
        this.balance = Math.round(this.balance * 100.0) / 100.0 ;       //return balance
        return balance;
    }
    // maybe do coins???
    public String returnChange() {                  //return change trying to add the loose change part
//        int quarters =0;
//        int dimes = 0;
//        int nickles = 0;
//
//        this.balance = Math.round(this.balance * 100.0 ) / 100.0;
//        double finalBalance = this.balance;
//
//        while (this.balance >= .25) {
//            quarters ++ ;
//            this.balance -= .25 ;
//            this.balance = Math.round(this.balance * 100.0 ) / 100.0;
//        }
//        while (this.balance >= .10) {
//            dimes ++;
//            this.balance -= .10 ;
//            this.balance = Math.round(this.balance * 100.0 ) / 100.0;
//        }
//        while (this.balance >= .05) {
//            nickles ++;
//            this.balance -= .05 ;
//            this.balance = Math.round(this.balance * 100.0 ) / 100.0;
//        }
//        this.balance = 0;
//        return "Your remaining change is : $"  + String.format("%.2f", finalBalance) + " in " + quarters + " Quarters, " + dimes + " Dimes" + ", and " + nickles + " Nickles.";

    return "Change $" + String.format("%.2f",balance);
    }
}
