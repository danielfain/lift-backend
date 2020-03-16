package dev.fain.lift.exercise;

import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {
    Exercise findById(int id);
    Exercise findByName(String name);
}
