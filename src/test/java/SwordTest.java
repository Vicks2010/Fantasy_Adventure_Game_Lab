import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before

    public void before(){
        sword = new Sword(7);
    }

    @Test

    public void willAttack(){

        assertEquals(7, sword.attack());
    }

    @Test

    public void whatDamageToEnemy(){

        assertEquals("Enemy damaged by a factor of 7", sword.damageToEnemy());
    }
}
