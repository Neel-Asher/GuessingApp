/**
* GuessingApp - Use Case 4: Error Handling and Validation
* 
* This class serves as the application entry point.
* It initializes the game configuration and displays game rules.
* 
* Use scanner class to receive input from the user (guess).
* Error Handling and Validation is introduced at this stage.
*
* @author Neel Asher
* @version 4.0
*/

import java.util.*;
public class GuessingApp {
	public static void main (String[] args) throws InvalidInputException {
		System.out.println("Welcome to the Guessing App!");
		GameConfig config = new GameConfig();
		config.showRules();
		
		Scanner sc = new Scanner (System.in);
		int attempts = 0;
		int hintCount = config.getMaxHints();
		
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
				break;
			} else {
				System.out.println(HintService.generateHint(config.getTargetNumber(),hintCount--));
			}
		}
	}
}
