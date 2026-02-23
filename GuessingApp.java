/**
* GuessingApp - Use Case 6: Game Restart and Exit
* 
* This class serves as the application entry point.
* It initializes the game configuration and displays game rules.
* 
* Use scanner class to receive input from the user (guess).
* Game Controller is introduced at this stage.
*
* @author Neel Asher
* @version 6.0
*/	

import java.util.*;
public class GuessingApp {
	public static void main (String[] args) throws InvalidInputException {
		System.out.println("Welcome to the Guessing App!");
		Scanner sc = new Scanner (System.in);
		boolean restart;
		
		do {
			System.out.print("Enter the player name: ");
			String player = sc.nextLine(); 
			
			GameConfig config = new GameConfig();
			config.showRules();
			
			int attempts = 0;
			int hintCount = config.getMaxHints();
			boolean win = false;
			
			/* 
			* Game loop runs until the player
			* exhausts the maximum attempts.
			*/
			while (attempts<config.getMaxAttempts()) {
				System.out.print("Enter your guess: ");
				int guess = ValidationService.validateInput(sc.nextLine());
				attempts++;
				
				String res = GuessValidator.validateGuess(guess,config.getTargetNumber());
				System.out.println(res);
				
				/*
				* Stop the loop immediately
				* if the correct number is guessed.
				*/
				if ("CORRECT".equals(res)) {
					win = true;
					break;
				} else {
					System.out.println(HintService.generateHint(config.getTargetNumber(),hintCount--));
				}
			}
			StorageService.saveResult(player,attempts,win);
			restart = GameController.restartGame(sc);
		} while (restart);
	}
}
