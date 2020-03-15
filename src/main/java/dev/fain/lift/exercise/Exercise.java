package dev.fain.lift.exercise;

import javax.persistence.*;

@Entity
@Table
public class Exercise {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int type;

    protected Exercise() {

    }

    public Exercise(String name, int type) {
        this.name = name;
        this.type = type;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
