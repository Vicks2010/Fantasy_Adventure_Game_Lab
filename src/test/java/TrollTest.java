import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;


    @Before

    public void before(){
        troll = new Troll("Troll1", 7);
    }

    @Test
    public void hasName(){
        assertEquals("Troll1", troll.getName());
    }

}
