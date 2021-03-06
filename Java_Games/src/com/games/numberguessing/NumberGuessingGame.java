package com.games.numberguessing;

import java.util.Random;
import com.games.ScannerHelper;

public class NumberGuessingGame {
	
	public void numberGuessingGame(){
		//1. build a random number generator with Random class in Java
		//2. need a variable to hold the number	between (100)+ 1 using .nextInt()
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(100) + 1;
		
		//test randomNumber
		//System.out.println("Random number is: " + randomNumber);
		
		int countTries = 0;
		
		//while loop to keep the game going until the right number is guess
		while(true) {
			System.out.println("Please enter your guess (1-100): ");
			
			//3. bring in Scanner for user input
			int playerGuess = ScannerHelper.ReadInputInt();
			countTries++;
			
			//4. if...else statements to compare playerGuess and randomNumber
			if(playerGuess == randomNumber) {
				System.out.println("Correct! You Win!");
				System.out.println("It took " + countTries + " tries.");
				break;
			}else if(randomNumber > playerGuess) {
				System.out.println("Wrong number to low. Guess again.");
			}else{
				System.out.println("Wrong number to high. Guess again.");
			}
			
		}
		 
	System.out.println("Play again. or Pick another game." );
		
	}

	
}
