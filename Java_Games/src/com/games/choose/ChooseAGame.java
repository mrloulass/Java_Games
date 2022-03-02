package com.games.choose;

import com.games.ScannerHelper;
import com.games.numberguessing.*;

public class ChooseAGame {
	
	public void chooseAGame(){
	System.out.println("Please choose a game to play 1.Number Guessing.");
	System.out.println("Please choose a game to play 2.Lottery.");
	System.out.println("Please choose a game to play 3.Rock,Papper & Scissor. ");
	System.out.println("Please choose a game to play 4.Space Man ");
	System.out.println("Please choose a game to play 5.More Games to Come. ");
	
	int playerChoice = ScannerHelper.ReadInputInt();
	
	if(playerChoice == 1) {
		System.out.println("Number Guessing Game");
		NumberGuessingGame guess = new NumberGuessingGame();
		guess.numberGuessingGame();
	}else {
		System.out.println("Please choose a game." );
		
	}
	}

}
