package dev.fain.lift.workout;

import dev.fain.lift.routine.Routine;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
    Workout findById(int id);
    Workout findByRoutine(Routine routine);
}
