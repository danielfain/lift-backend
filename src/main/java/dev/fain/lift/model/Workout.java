package dev.fain.lift.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Workout {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Routine routine;

    @ManyToMany
    private List<Exercise> exercises = new ArrayList<>();

    protected Workout() {}

    public Workout(Routine routine) {
        this.routine = routine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

}
