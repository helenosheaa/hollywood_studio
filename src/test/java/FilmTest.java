import models.Actor;
import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {

    Film film;
    Director director1;
    Studio studio1;

    @Before
    public void before() {
        director1 = new Director("Tim", "Burton", 20000000.00 );
        studio1 = new Studio("The Studio", 50000000.00);
        film = new Film("Sweeny Todd", director1, studio1);
    }

    @Test
    public void hasTitle() {
        assertEquals("Sweeny Todd", film.getTitle());
    }


    @Test
    public void hasDirector() {
        assertEquals(director1, film.getDirector());
    }

    @Test
    public void hasStudio() {
        assertEquals(studio1, film.getStudio());
    }

}
