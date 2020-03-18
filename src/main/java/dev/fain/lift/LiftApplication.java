package dev.fain.lift;

import dev.fain.lift.model.Exercise;
import dev.fain.lift.repository.ExerciseRepository;
import dev.fain.lift.model.Routine;
import dev.fain.lift.repository.RoutineRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LiftApplication {

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

			Exercise squat = repository.findByName("Squat");
			System.out.println("Found squat");
		};
	}

	@Bean
	public CommandLineRunner demoRoutine(RoutineRepository repository) {
		return (args) -> {
			repository.save(new Routine("StrongLifts 5x5", 3));
			repository.save(new Routine("PPL", 6));
			repository.save(new Routine("PHAT", 4));
			repository.save(new Routine("LPP", 6));

			Routine ppl = repository.findByName("PPL");
			System.out.println("Found PPL");
		};
	}

//	@Bean
//	public CommandLineRunner demoSet(SetRepository repository) {
//		return (args) -> {
//			repository.save(new Set("StrongLifts 5x5", 3));
//			repository.save(new Set("PPL", 6));
//			repository.save(new Set("PHAT", 4));
//			repository.save(new Set("LPP", 6));
//
//			Routine ppl = repository.findSetsByWorkout(new Workout());
//			System.out.println("Found PPL");
//		};
//	}

}
