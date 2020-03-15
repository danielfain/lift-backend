package dev.fain.lift.routine;

import dev.fain.lift.exercise.Exercise;

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

    protected RoutineExercises() {

    }

    public RoutineExercises(Routine routine, Exercise exercise) {
        this.routine = routine;
        this.exercise = exercise;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
