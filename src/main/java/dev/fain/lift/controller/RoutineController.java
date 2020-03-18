package dev.fain.lift.controller;

import dev.fain.lift.dto.RoutineDTO;
import dev.fain.lift.model.Routine;
import dev.fain.lift.repository.RoutineRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoutineController {

    private final RoutineRepository repo;

    public RoutineController(RoutineRepository repo) {
        this.repo = repo;
    }

    @PostMapping(value = "/api/routine", consumes = "application/json")
    public RoutineDTO createRoutine(@RequestBody RoutineDTO routine) {
        System.out.println("THIS WAS HIT!");
        System.out.println(routine);
        return routine;
    }

    @GetMapping("/api/routines")
    public List<Routine> getRoutines() {
        List<Routine> routines = new ArrayList<>();

        for (Routine r : repo.findAll()) {
            routines.add(r);
        }

        return routines;
    }

}
