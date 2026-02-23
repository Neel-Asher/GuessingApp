/**
* GuessingApp - Use Case 1: Game Initialization
* 
* This class serves as the application entry point.
* It initializes the game configuration and displays game rules.
* 
* No user input or gameplay logic is implemented at this stage.
*
* @author Neel Asher
* @version 1.0
*/

import java.util.*;
public class GuessingApp {
	public static void main (String[] args) {
		System.out.println("Welcome to the Gussing App!");
		GameConfig config = new GameConfig();
		config.showRules();
		
		Scanner sc = new Scanner (System.in);
		int attempts = 0;
		
		/* 
		* Game loop runs until the player
		* exhausts the maximum attempts.
		*/
		while (attempts<config.getMaxAttempts()) {
			System.out.print("Enter your guess: ");
			int guess = sc.nextInt();
			attempts++;
			
			String res = GuessValidator.validateGuess(guess,config.getTargetNumber());
			System.out.println(res);
			
			/*
			* Stop the loop immediately
			* if the correct number is guessed.
			*/
			if ("CORRECT".equals(res)) break;	
		}
	}
}