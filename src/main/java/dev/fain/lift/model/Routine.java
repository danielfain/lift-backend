package dev.fain.lift.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Routine {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int days;

    @ManyToMany
    @OrderBy("name ASC")
    private List<Exercise> exercises = new ArrayList<>();

    protected Routine() {

    }

    public Routine(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Routine: " + this.name;
    }
}
