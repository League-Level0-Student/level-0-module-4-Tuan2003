//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
String userInput = JOptionPane.showInputDialog("How many nickles do you have?");
int amountNickles = Integer.parseInt(userInput);
String dimeInput = JOptionPane.showInputDialog("How many dimes do you have?");
int amountDimes = Integer.parseInt(dimeInput);
String quarterInput = JOptionPane.showInputDialog("How many quarters do you have?");
int amountQuarters = Integer.parseInt(quarterInput);


double totalNickles = amountNickles * 0.05; 

double totalDimes = amountDimes * 0.10;

double totalQuarters = amountQuarters * 0.25; 

double totalAmount = totalNickles + totalDimes + totalQuarters;

System.out.println("You have $" + totalAmount);

		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

