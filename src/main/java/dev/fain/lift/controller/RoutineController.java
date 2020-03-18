package dev.fain.lift.controller;

import dev.fain.lift.dto.RoutineDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutineController {
    @PostMapping(value = "/api/routine", consumes = "application/json")
    public RoutineDTO createRoutine(@RequestBody RoutineDTO routine) {
        System.out.println("THIS WAS HIT!");
        System.out.println(routine);
        return routine;
    }
}
