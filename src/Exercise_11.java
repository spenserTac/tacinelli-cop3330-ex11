/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */


import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String temp1 = scanner.nextLine();
        int euro_amount = Integer.parseInt(temp1);

        System.out.print("What is the exchange rate? ");
        String temp2 = scanner.nextLine();
        float exchange_rate = (float) Float.parseFloat(temp2);

        float usd_amount = (float) euro_amount * exchange_rate;

        System.out.println(euro_amount +  " euros at an exchange rate of " +
                exchange_rate + " is \n" + String.format("%.2f",usd_amount) + " U.S. dollars.");
    }
}
