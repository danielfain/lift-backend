package dev.fain.lift.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @CreationTimestamp
    private Timestamp createdAt;

    @ManyToOne
    private Routine routine;

    protected User() {}

    public User(String name, Routine routine) {
        this.name = name;
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
