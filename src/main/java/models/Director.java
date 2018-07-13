package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "directors")

public class Director extends Staff {

    private List<Film> films;

    public Director(String firstName, String lastName, double bankAccount) {
        super(firstName, lastName, bankAccount);
        this.films = new ArrayList<Film>();
    }

    public Director() {
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
