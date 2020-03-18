package dev.fain.lift.repository;

import dev.fain.lift.model.Routine;
import org.springframework.data.repository.CrudRepository;

public interface RoutineRepository extends CrudRepository<Routine, Integer> {
    Routine findById(int id);
    Routine findByName(String name);
}
