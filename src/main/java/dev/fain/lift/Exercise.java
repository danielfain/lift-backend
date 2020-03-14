package dev.fain.lift;

import javax.persistence.*;

@Entity
@Table
public class Exercise {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int type;

    protected Exercise() {

    }

    public Exercise(String name, int type) {
        this.name = name;
        this.type = type;
    }
}
