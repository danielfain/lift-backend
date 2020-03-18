package dev.fain.lift;

import dev.fain.lift.model.Exercise;
import dev.fain.lift.model.Set;
import dev.fain.lift.model.Workout;
import dev.fain.lift.repository.ExerciseRepository;
import dev.fain.lift.model.Routine;
import dev.fain.lift.repository.RoutineRepository;
import dev.fain.lift.repository.SetRepository;
import dev.fain.lift.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class LiftApplication {

	@Autowired
	ExerciseRepository er;

	@Autowired
	RoutineRepository rr;

	@Autowired
	WorkoutRepository wr;

	public static void main(String[] args) {
		SpringApplication.run(LiftApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoExercise(ExerciseRepository repository) {
		return (args) -> {
			repository.save(new Exercise("Squat", 3));
			repository.save(new Exercise("Bench Press", 1));
			repository.save(new Exercise("Lat Pulldown", 2));
			repository.save(new Exercise("Lateral Raise", 1));
		};
	}

	@Bean
	public CommandLineRunner demoRoutine(RoutineRepository repository) {
		return (args) -> {
			repository.save(new Routine("StrongLifts 5x5", 3));
			repository.save(new Routine("PPL", 6));
			repository.save(new Routine("PHAT", 4));
			repository.save(new Routine("LPP", 6));
		};
	}

	@Bean
	public CommandLineRunner demoSet(SetRepository repository) {
		return (args) -> {
			Routine r1 = rr.findByName("PPL");
			Exercise e1 = er.findByName("Squat");
			Workout w1 = new Workout(r1);
			wr.save(w1);
			repository.save(new Set(w1, e1, 1, 12));
			repository.save(new Set(w1, e1, 2, 11));
			repository.save(new Set(w1, e1, 3, 8));

			List<Set> sets = repository.findSetsByWorkout(w1);
			for (Set s : sets) {
				System.out.println("Set " + s.getSet() + ": " + s.getReps());
			}
		};
	}

}
