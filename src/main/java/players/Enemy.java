package players;

public abstract class Enemy {

    private String name;
    private int healthPoints;

    public Enemy(String enemyName, int healthPoints){
        this.name = enemyName;
        this.healthPoints = healthPoints;
    }

    public void takeDamage(){
        healthPoints -= 1;
    }

    public String getName(){
        return name;
    }


}


