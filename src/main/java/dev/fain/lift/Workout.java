package dev.fain.lift;

import javax.persistence.*;

@Entity
@Table
public class Workout {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private int day;

    @ManyToOne
    private Routine routine;

    protected Workout() {

    }

    public Workout(int day, Routine routine) {
        this.day = day;
        this.routine = routine;
    }

}
