/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.storemyseas;

import java.util.Scanner;
/**
 *
 * @author Jollibee
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
System.out.println("Welcome to Storemy Seas");
System.out.println("Choose your poison");
System.out.println("1 - Whiskey = 3 bucks");
int Whiskey = 3;
System.out.println("2 - Rum = 2 bucks");
int Rum = 2;
System.out.println("3 - Vodka = 3 bucks");
int Vodka = 3;
System.out.println("4 - Beer = 1 buck");
int Beer = 1;
System.out.println("5 - Tequila = 2 bucks");
int Tequila = 2;
int a = input.nextInt();
        if (a <= 1){
            System.out.println("(If you order 5 Whiskey, you will get 3 bucks discount)");
            System.out.println("How many would you buy??");
            int quantity = input.nextInt();
                if ((quantity%5) == 0){
                    int total = quantity * Whiskey;
                    int promo = quantity / 5;
                    int discount = 3;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire ");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Whiskey");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
                else if ((quantity-1) == (quantity%5)) {
                    int quantity1 = quantity - 1;
                    int total = quantity * Whiskey;
                    int promo = quantity1 / 5;
                    int discount = 3;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Whiskey");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
                else if ((quantity-2) == (quantity%5)) {
                    int quantity1 = quantity - 2;
                    int total = quantity * Whiskey;
                    int promo = quantity1 / 5;
                    int discount = 3;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Whiskey");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
            }
        else if (a == 2){           
            System.out.println("(If you order 6 Rum, you get a 2 bucks discount)");
            System.out.println("How much would you buy?");
            int quantity = input.nextInt();
                if ((quantity%6) == 0){
                    int total = quantity * Rum;
                    int promo = quantity / 6;
                    int discount = 2;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Rum");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
                else {
                    int quantity1 = quantity - 1;
                    int total = quantity * Rum;
                    int promo = quantity1 / 6;
                    int discount = 2;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Rum");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
        }
        else if (a == 3){
            System.out.println("(If you buy 4 Vodka, you will get a 2 bucks discount)");
            System.out.println("How much would you buy?");
            int quantity = input.nextInt();
                if ((quantity%4) == 0){
                    int total = quantity * Vodka;
                    int promo = quantity / 4;
                    int discount = 2;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Rum");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
                else if ((quantity-1) == (quantity%4)) {
                    int quantity1 = quantity - 1;
                    int total = quantity * Rum;
                    int promo = quantity1 / 4;
                    int discount = 2;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Rum");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
                else if ((quantity-2) == (quantity%4)) {
                    int quantity1 = quantity - 2;
                    int total = quantity * Rum;
                    int promo = quantity1 / 4;
                    int discount = 24;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Rum");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
        }
        else if (a == 4){
            System.out.println("(If you order 5 Beers, you get a 2 bucks discount)");
            System.out.println("How much would you buy?");
            int quantity = input.nextInt();
                if ((quantity%5) == 0){
                    int total = quantity * Beer;
                    int promo = quantity / 5;
                    int discount = 2;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Beer");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
                else {
                    int quantity1 = quantity - 1;
                    int total = quantity * Beer;
                    int promo = quantity1 / 5;
                    int discount = 2;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Beer");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
        }
        else if (a == 5){
            System.out.println("(If you buy 8 Tequila, you will get 1 buck discount)");
            System.out.println("How much would you buy?");
            int quantity = input.nextInt();
                if ((quantity%8) == 0){
                    int total = quantity * Tequila;
                    int promo = quantity / 8;
                    int discount = 1;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total sire");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Tequila");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
                else {
                    int quantity1 = quantity - 1;
                    int total = quantity * Tequila;
                    int promo = quantity1 / 8;
                    int discount = 1;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " is the price");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " is the total");
                    System.out.println("Your cash is?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("You're short with " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Tequila");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Enjoy and Drink Responsibly");
                    }
                }
        }
        else {
            System.out.println("There's no other option lad");
            System.exit(0);
        }
    }
}