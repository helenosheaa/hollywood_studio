import models.Actor;
import models.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Tim", "Burton", 20000000.00 );
    }

    @Test
    public void hasFirstName() {
        assertEquals("Tim", director.getFirstName());
    }


    @Test
    public void hasLastName() {
        assertEquals("Burton", director.getLastName());
    }

    @Test
    public void hasBankAccount() {
        assertEquals(20000000.00, director.getBankAccount(), 0.01);
    }

}
