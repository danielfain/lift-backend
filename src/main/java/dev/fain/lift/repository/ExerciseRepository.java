package dev.fain.lift.repository;

import dev.fain.lift.model.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {
    Exercise findById(int id);
    Exercise findByName(String name);
}
