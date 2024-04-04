package enemies;

public class Enemy {

    public String enemyType;

    public Enemy(String enemyType){
        this.enemyType = enemyType;
    }

    String getEnemyType(){
        return this.enemyType;
    }
}
