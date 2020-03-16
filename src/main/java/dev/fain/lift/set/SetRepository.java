package dev.fain.lift.set;

import dev.fain.lift.workout.Workout;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SetRepository extends CrudRepository<Set, Integer> {
    Set findById(int id);
    List<Set> findSetsByWorkout(Workout workout);
}


