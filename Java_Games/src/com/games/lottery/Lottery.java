package com.games.lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.games.ScannerHelper;

public class Lottery {
	//random six numbers that range from 1-49 and they can not repeat
	public void lottery() {
		
	//1. List of integer to hold the numbers
	List<Integer> winningNumbers = new ArrayList<>();
	
	//2. Generate random number import Random class in java
	Random random = new Random();
	
	//3. loop six numbers for the lottery
		for (int i = 0; i < 6; i++) {
			//Use the while true to check if when winning number is on the List if not try again
			while(true) {
			//random numbers between 1 and 48 using nextInt with +1 the random number will be between 1 and 49;
				int winningNumber = random.nextInt(49) + 1;
				if(!winningNumbers.contains(winningNumber)) {
					winningNumbers.add(winningNumber);
					break;
				}
			}
		}
		System.out.println(winningNumbers);
		//user enter six numbers
		System.out.println("Please enter your six numbers between 1 and 49");
		
		List<Integer> guessedNumbers = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			while(true) {
			String numberString = ScannerHelper.ReadInputString();
			int number = Integer.parseInt(numberString);
			if(number >= 1 && number <= 49) {
				guessedNumbers.add(number);
				break;
				}
			else {
				System.out.println(number + " is not bet");
			}
			}
		}
		
	}
}