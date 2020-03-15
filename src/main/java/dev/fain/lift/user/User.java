package dev.fain.lift.user;

import dev.fain.lift.routine.Routine;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Timestamp createdAt;

    @ManyToOne
    @JoinColumn
    private Routine routine;

    protected User() {

    }

    public User(String name, Timestamp createdAt, Routine routine) {
        this.name = name;
        this.createdAt = createdAt;
        this.routine = routine;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }
}
