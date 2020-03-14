package dev.fain.lift;

import javax.persistence.*;

@Entity
@Table
public class Routine {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int days;

    protected Routine() {

    }

    public Routine(String name, int days) {
        this.name = name;
        this.days = days;
    }

}
