package dev.fain.lift.repository;

import dev.fain.lift.model.Routine;
import dev.fain.lift.model.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
    Workout findById(int id);
    Workout findByRoutine(Routine routine);
}
