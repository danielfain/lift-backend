package dev.fain.lift.routine;

import org.springframework.data.repository.CrudRepository;

public interface RoutineRepository extends CrudRepository<Routine, Integer> {
    Routine findById(int id);
    Routine findByName(String name);
}
