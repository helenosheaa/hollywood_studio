package db;

import models.Actor;
import models.Film;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBActor {

    private static Session session;
    private static Transaction transaction;

    public static void addActorToFilm(Actor actor, Film film){
        actor.addFilm(film);
        DBHelper.update(actor);
    }

    public static List<Film> getActorsFilms(Actor actor){
        List<Film> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Film.class);
            cr.createAlias("actors", "actor");
            cr.add(Restrictions.eq("actor.id", actor.getId()));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }
}
