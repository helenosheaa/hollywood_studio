import models.Director;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudioTest {

    Studio studio;

    @Before
    public void before() {
        studio = new Studio("The Studio", 50000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("The Studio", studio.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(50000000.00, studio.getBudget(), 0.01);
    }
}
