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

  //  public CashDrawer() {}

    public void addCash(double input) {
        if (input > 0) {
            this.balance += input;
        }
    }
    public boolean verifyPrice(String itemID){
        double price = Menu.cateringMachine.getCurrentInventory().getItemPrice(itemID);
        return price <= balance;
    }

    public void deductPrice(double price) {
        this.balance -= price;
    }
    public double getBalance(){
        this.balance = Math.round(this.balance * 100.0) / 100.0 ;
        return balance;
    }
    // maybe do coins???
    public String returnChange() {
        return "Your remaining change is : $" + balance;
    }
}
