package com.games.choose;

import com.games.ScannerHelper;
import com.games.numberguessing.*;
import com.games.lottery.*;

public class ChooseAGame {

	
	public void chooseAGame(){
		
		String [] gamesNames = {"1.Number Guessing","2.Lottery","3.Rock,Papper & Scissor","4.Space Man","5.More Games to Come"};
		
		System.out.println("Please choose a game to play:");
		
		
		for(String gameName : gamesNames) {
		System.out.println(gameName);
		}
		
		while(true) {
			
		int playerChoice = ScannerHelper.ReadInputInt();
		
		switch(playerChoice) {
		case 1:
			System.out.println("Number Guessing Game");
			NumberGuessingGame guess = new NumberGuessingGame();
			guess.numberGuessingGame();
			break;
		case 2:
			System.out.println("Lottery Game");
			Lottery playLotto = new Lottery();
			playLotto.lottery();
			break;
		case 3:
			System.out.println("Rock,Papper & Scissor Game");
			//new object and code
			break;
		case 4:
			System.out.println("Space Man");
			//new object and code
			break;
		case 5:
			System.out.println("More Games to Come");
			//new object and code
			break;
		default:
			System.out.println("Please choose a game to play:");
			
			for(String gameName : gamesNames) {
				System.out.println(gameName);
				}
		}
	
		}

	}

	
}
