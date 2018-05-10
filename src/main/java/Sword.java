public class Sword implements IWeapon{

    private int damageValue;

    public Sword(int damageValue){
        this.damageValue = 7;
    }

    public int attack() {

       return 7;
    }

    public String damageToEnemy(){

        return "Enemy damaged by a factor of 7";
    }
}
