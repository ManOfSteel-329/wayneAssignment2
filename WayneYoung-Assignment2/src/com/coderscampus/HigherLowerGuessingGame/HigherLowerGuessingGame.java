package com.coderscampus.HigherLowerGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		int theRandomNumber = random.nextInt(100)+1;
		//System.out.println(theRandomNumber);
		 
		int userPick = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please pick a number between 1 amd 100: ");
		String input = scan.nextLine();
		Integer intInput = Integer.parseInt(input);

		int userAttempts = 0;
		//userPick = intInput;
		
		

		while (!(userPick == theRandomNumber)&& userAttempts < 4) {
			userPick = intInput;
			if (userPick < theRandomNumber) {
				System.out.println("Your number is too low");
			}else if (userPick > theRandomNumber) {
				System.out.println("Your number is too high");
			}else if (userPick == theRandomNumber) {
				System.out.println("You Won!");
				break;
			}
			System.out.println("Try again: ");
			input = scan.nextLine();
			intInput = Integer.parseInt(input);
			//userPick = intInput;
			userAttempts = userAttempts + 1;
			//userPick = intInput; 
			System.out.println("You Lost!!!");
		}
		//System.out.println("You Lost!!!");
		
		
	}

}
