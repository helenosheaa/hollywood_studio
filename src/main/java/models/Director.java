package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "directors")

public class Director extends Staff {

    private Set<Film> films;

    public Director(String firstName, String lastName, double bankAccount) {
        super(firstName, lastName, bankAccount);
    }

    public Director() {
    }

    @OneToMany(mappedBy="director", fetch = FetchType.LAZY)
    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
