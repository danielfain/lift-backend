package dev.fain.lift;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Result implements Serializable {

    @Id
    @ManyToOne
    private Workout workout;

    @Id
    @ManyToOne
    private Exercise exercise;

    @Column(nullable = false)
    private int set;

    @Column(nullable = false)
    private int reps;

    protected Result() {

    }

    public Result(Workout workout, Exercise exercise, int set, int reps) {
        this.workout = workout;
        this.exercise = exercise;
        this.set = set;
        this.reps = reps;
    }

}