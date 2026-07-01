package com.tracker; // <-- Tells Java this is in the tracker folder

import com.tracker.model.Exercise; // <-- Tells Java where to find the Exercise model
import com.tracker.model.Workout;
import com.tracker.repository.WorkoutRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calisthenics and HIIT Tracker");

		Workout shoulderWorkout = new Workout("s1", "6/30/2026", "Upper-Body");
		Workout chestWorkout = new Workout("c1", "7/1/2026", "Upper-Body");
		Workout backWorkout = new Workout("b1", "7/1/2026", "Upper-Body");
		Workout tricepWorkout = new Workout("t1", "7/1/2026", "Upper-Body");



		WorkoutRepository workouts = new WorkoutRepository();

		workouts.addTOTheList(tricepWorkout);
		workouts.addTOTheList(chestWorkout);
		workouts.addTOTheList(backWorkout);
		workouts.addTOTheList(shoulderWorkout);

		

        Exercise newExercise1 = new Exercise("Pike Push-ups", "Strength", 3, 12, 0);
		Exercise newExercise2 = new Exercise("Dumbell Overhead Press", "Strength", 3, 12, 0);

		Exercise newExercise3 = new Exercise("Weighted Pull-Ups", "Strength", 3, 12, 0);
		Exercise newExercise4 = new Exercise("one sided dumbell rows", "Strength", 3, 12, 0);

		Exercise newExercise5 = new Exercise("Weighted Push-ups", "Strength", 3, 12, 0);
		Exercise newExercise6 = new Exercise("Bench press", "Strength", 3, 12, 0);

		Exercise newExercise7 = new Exercise("Diamond Push-ups", "Strength", 3, 12, 0);
		Exercise newExercise8 = new Exercise("Cable push downs", "Strength", 3, 12, 0);

		shoulderWorkout.addExercises(newExercise2);
		shoulderWorkout.addExercises(newExercise1);

		chestWorkout.addExercises(newExercise5);
		chestWorkout.addExercises(newExercise6);

		tricepWorkout.addExercises(newExercise8);
		tricepWorkout.addExercises(newExercise7);

		backWorkout.addExercises(newExercise3);
		backWorkout.addExercises(newExercise4);

		
		
		showDetails(tricepWorkout);
		showDetails(backWorkout);
		showDetails(shoulderWorkout);
		showDetails(chestWorkout);


		System.out.println("### SIZE OF THE WORKOUT REPOSITORY: "+ workouts.findAll().size());
		
    }

	public static void showDetails(Workout workout){
		System.out.println("---- Details of Workout ID "+ workout.getId()+ " ----");

			
		System.out.println(workout.getId());
		System.out.println(workout.getDate());
		System.out.println(workout.getFocusArea());
		workout.listAllExercises();

		}
}