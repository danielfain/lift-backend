package dev.fain.lift;

import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {

    Exercise findById(int id);
    Exercise findByName(String name);

}
