import java.util.*;
// Import packages to be able to reference them
import classes.*;
// import enemies.*;


// --------------------------- THINGS TO DO -------------------------------------- //
// 

// Class which does the entire game
public class Game {
    Player player;
    Scanner reader = new Scanner(System.in);

    public Game() {
        startGame();
    }
    
    // Get user choice to begin or immediately quit the game
    void startGame(){
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
                inputName(); 
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

    // Function which gets the user's name
    void inputName() {
        String userName;

        while(true) {
            System.out.println("What is your name? : ");
            try{
                userName = reader.next();
                break;
            } catch(Exception e) {
                reader.next();
                System.out.println("Invalid input. Please put a valid input.");
            }
        }
        // Send user name to pick class function 
        pickClass(userName);
    }

    // Function in which the user picks which class they want to play as
    void pickClass(String name){
        int userChoice;

        // Allows user to pick a class or display info of how the classes work
        while(true) {
            System.out.println("Which Class do you want to pick " + name + "?\n1. Fighter \n2. Mage \n3. Rogue \n4. Info on Classes");
            try{
                userChoice = reader.nextInt();
                break;
            } catch(Exception e) {
                reader.next();
                System.out.println("Invalid input. Please put a valid input.");
            }
        }

        switch (userChoice) {
            case 1:    
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                classInfo();
                pickClass(name);
                break;
            default:
                System.out.println("You did not pick a correct choice, please input something correctly");
                pickClass(name);
                break;
        }
    }

    // Function which just displays info about the clases
    void classInfo(){
        System.out.println("Classes: \n\nThe Fighter: \nThe most resilient class with a moderate amount of damage.\n");
        System.out.println("The Mage: \nThe highest damage output with a somewhat decent chance of dodging.\n");
        System.out.println("The Rogue: \nA moderate amount of damage with the highest chance of dodging.\n");
    }
}
