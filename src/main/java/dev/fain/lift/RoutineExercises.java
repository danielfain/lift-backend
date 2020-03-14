package dev.fain.lift;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class RoutineExercises implements Serializable {

    @Id
    @ManyToOne
    private Routine routine;

    @Id
    @ManyToOne
    private Exercise exercise;

    @Column(nullable = false)
    private int day;

    @Column(nullable = false)
    private int sets;

    @Column(nullable = false)
    private int reps;

    protected RoutineExercises() {

    }

    public RoutineExercises(Routine routine, Exercise exercise, int day, int sets, int reps) {
        this.routine = routine;
        this.exercise = exercise;
        this.day = day;
        this.sets = sets;
        this.reps = reps;
    }
}
