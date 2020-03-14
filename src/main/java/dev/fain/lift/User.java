package dev.fain.lift;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    private int d;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Timestamp createdAt;

    @ManyToOne
    private Routine routine;

    protected User() {

    }

    public User(String name, Timestamp createdAt, Routine routine) {
        this.name = name;
        this.createdAt = createdAt;
        this.routine = routine;
    }
}
