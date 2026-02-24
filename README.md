# GuessingApp
Guessing App - Object-Oriented Programming Learning Project

## UC1 - GuessingApp → GameInitialization - 23.02.2026

+ Initialize the guessing game.
+ Set up the game configuration.
+ Display the game rules.

## UC2 - GuessingApp → UserGuessSubmission - 23.02.2026

+ Updated UC1 with user interaction.
+ Use scanner class to receive input from user.
+ Add GuessValidator to validate user's guesses.
+ Integrate Guessvalidator into GuessingApp. 

## UC3 - GuessingApp → HintGeneration - 23.02.2026

+ Update UC2 with the generation of hints.
+ Add HintService class to provide limited amount of hints to the user.
+ Integrate HintService into GuessingApp.

## UC4 - GuessingApp → ErrorHandlingAndValidation - 23.02.2026

+ Updated UC3 by handling exceptions and validating them.
+ Add InvalidInputException and ValidationService classes to improve debugging.
+ Integrate these classes into GuessingApp.

## UC5 - GuessingApp → GameResultStorage - 23.02.2026

+ Updated UC4 by saving game results in a text file.
+ Add StorageService class to collect results.
+ Integrate StorageService class into GuessingApp.

## UC6 - GuessingApp → GameRestartAndExit - 23.02.2026

+ Updated UC5 by adding restart and exit functionality.
+ Give the user an option to either play the game again or exit.
+ All iterations of the game and its details are stored in a text file.
+ Use do-while loops to implement this feature.
+ Add GameController as the restart executor.
+ Intergrate GameControler into GuessingApp.
