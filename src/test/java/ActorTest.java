import models.Actor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {

    Actor actor;

    @Before
    public void before() {
        actor = new Actor("Johnny", "Depp", 20000000.00 );
    }

    @Test
    public void hasFirstName() {
        assertEquals("Johnny", actor.getFirstName());
    }


    @Test
    public void hasLastName() {
        assertEquals("Depp", actor.getLastName());
    }

    @Test
    public void hasBankAccount() {
        assertEquals(20000000.00, actor.getBankAccount(), 0.01);
    }
}
