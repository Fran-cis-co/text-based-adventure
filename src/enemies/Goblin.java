package enemies;


public class Goblin extends Enemy{
    // Goblin is the weakest enemy in the game with it being the easiest to hit
    final double chanceDodging = 5.0;
    final double damageResistance = 1.0;
    final int attackDamage = 4;

    int health = 90;
    static String enemyType = "Goblin";

    public Goblin() {
        super(enemyType);
    }

    String getName(){
        return enemyType;
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
