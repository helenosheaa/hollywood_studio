import db.DBDirector;
import db.DBHelper;
import db.DBStudio;
import models.Actor;
import models.Director;
import models.Film;
import models.Studio;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Director director1 = new Director("Tim", "Burton", 20000000.00 );
        DBHelper.save(director1);

        Director director2 = new Director("Florian", "Henckel von Donnersmarck", 20000000.00 );
        DBHelper.save(director2);

        Studio studio1 = new Studio("The Studio", 50000000.00);
        DBHelper.save(studio1);

        Film film1 = new Film("Sweeney Todd", director1, studio1);
        DBHelper.save(film1);

        Film film2 = new Film("Alice in Wonderland", director1, studio1);
        DBHelper.save(film2);

        Film film3 = new Film("The Tourist", director2, studio1);
        DBHelper.save(film3);

        Actor actor1 = new Actor("Johnny", "Depp", 20000000.00);
        DBHelper.save(actor1);

        Actor actor2 = new Actor("Angelina", "Jolie", 25000000.00);
        DBHelper.save(actor2);

        Actor actor3 = new Actor("Helena", "Bonham Carter", 10000000.00);
        DBHelper.save(actor3);

        List<Film> filmsForStudio1 = DBStudio.getFilmsForStudio(studio1);

        List<Film> filmsForDirector1 = DBDirector.getFilmsForDirector(director1);

        List<Film> filmsForDirector2 = DBDirector.getFilmsForDirector(director2);

    }
}
