import java.util.*;
// Import packages to be able to reference them
import classes.*;
// import enemies.*;

// Class which does the entire game
public class Game {
    Player player;
    Scanner reader = new Scanner(System.in);

    public Game() {
        startGame();
    }
    
    // Get user choice to begin or immediately quit the game
    public void startGame(){
        int userChoice;
        
        // Use while loop to ensure a correct input is acquired
        while(true) {
            System.out.println("Hello adventurer! Please type a number to choose an option: \n1. Play the game \n2. Quit");
            // Use try catch to ensure user puts a correct value
            try{
                userChoice = reader.nextInt();
                break;
            } catch(Exception e) {
                reader.next();
                System.out.println("Invalid input. Please put a valid input.");
            }
        }

        // Switch case to determine what the user input
        switch (userChoice) {
            case 1:
                System.out.println("Chose to play the game");
                break;
        
            case 2:
                System.out.println("See you next time, Adventurer!");
                break;
            default:
                System.out.println("You did not pick a correct choice, please input something correctly");
                startGame();
                break;
        }
    }
}
