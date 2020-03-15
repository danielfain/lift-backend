package dev.fain.lift.routine;

import javax.persistence.*;

@Entity
@Table
public class Routine {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int days;

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
}
