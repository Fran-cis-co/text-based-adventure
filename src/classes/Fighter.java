package classes;

public class Fighter extends Player{
    // Fighter has the lowest chance of dodging but the highest damage resistence
    final double chanceDodging = 10;
    final double damageResistance = 50;
    // Attack damage which ranges between 5 - (attackDamage)
    final int attackDamage = 20;

    // have fighter health set to 200 since it can tank the most out of all the classes
    public int health = 200;
    public static String playerClass = "Fighter";

    public Fighter(String name) {
        super(name, playerClass);
    }

    public String getPlayerClass(){
        return playerClass;
    }

    int getAttackDamage(){
        return this.attackDamage;
    }

    double getDamageResistance(){
        return this.damageResistance;
    }

    double getDodgeChance(){
        return this.chanceDodging;
    }

    int getHealth(){
        return this.health;
    }
    
}
