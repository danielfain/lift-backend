package dev.fain.lift.repository;

import dev.fain.lift.model.Set;
import dev.fain.lift.model.Workout;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SetRepository extends CrudRepository<Set, Integer> {
    Set findById(int id);
    List<Set> findSetsByWorkout(Workout workout);
}


