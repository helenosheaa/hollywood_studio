package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actors")

public class Actor extends Staff {

    private List<Film> films;

    public Actor(String firstName, String lastName, double bankAccount) {
        super(firstName, lastName, bankAccount);
        this.films = new ArrayList<Film>();
    }

    public Actor() {
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
