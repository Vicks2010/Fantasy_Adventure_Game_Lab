package players;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String namePassedIn, int healthPointsPassedIn){
        this.name = namePassedIn;
        this.healthPoints = healthPointsPassedIn;
    }

    public String getName(){
        return this.name;
    }
}
