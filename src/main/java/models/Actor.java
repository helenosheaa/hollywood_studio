package models;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    @Cascade(CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "actors_films",
    joinColumns = {@JoinColumn(name = "actor_id", nullable = false, updatable = false)},
    inverseJoinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)})
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
