package dev.fain.lift.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table
public class Set implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Workout workout;

    @ManyToOne
    private Exercise exercise;

    private int set;

    private int reps;

    private Timestamp completedAt;

    protected Set() {

    }

    public Set(Workout workout, Exercise exercise, int set, int reps) {
        this.workout = workout;
        this.exercise = exercise;
        this.set = set;
        this.reps = reps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public Timestamp getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt;
    }
}