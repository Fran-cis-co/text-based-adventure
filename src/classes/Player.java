package classes;
// Parent class which just contains the player's name and their class
public class Player {
    private String name;
    private String playerClass;

    // Set variables and methods to get variables
    public Player(String name, String playerClass){
        this.name = name;
        this.playerClass = playerClass;
    }
    
    public String getName(){
        return this.name;
    }

    public String getPlayerClass(){
        return this.playerClass;
    }
}