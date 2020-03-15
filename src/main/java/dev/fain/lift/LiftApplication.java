package dev.fain.lift;

import dev.fain.lift.exercise.Exercise;
import dev.fain.lift.exercise.ExerciseRepository;
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
	public CommandLineRunner demo(ExerciseRepository repository) {
		return (args) -> {
			repository.save(new Exercise("Squat", 3));
			repository.save(new Exercise("Bench Press", 1));
			repository.save(new Exercise("Lat Pulldown", 2));
			repository.save(new Exercise("Lateral Raise", 1));

			for (Exercise e : repository.findAll()) {
				System.out.println(e);
			}

			Exercise squat = repository.findByName("Squat");
			System.out.println("Found squat: " + squat);
		};
	}

}
