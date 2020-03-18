package dev.fain.lift.dto;

public class RoutineDTO {

    private String name;

    private int days;

    public RoutineDTO(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Routine: " + this.name;
    }

}
