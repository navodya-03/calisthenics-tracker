package com.tracker; // <-- Tells Java this is in the tracker folder

import com.tracker.model.Exercise; // <-- Tells Java where to find the Exercise model
import com.tracker.model.Workout;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calisthenics and HIIT Tracker");

		Workout shoulderWorkout = new Workout("s1", "6/30/2026", "Upper-Body");
		

        Exercise newExercise1 = new Exercise("Muscle-Up", "Strength", 3, 12, 0);
		 Exercise newExercise2 = new Exercise("Weighted Pull-Ups", "Strength", 3, 12, 0);
		shoulderWorkout.addExercises(newExercise2);
		shoulderWorkout.addExercises(newExercise1);
		System.out.println(shoulderWorkout.getId());
		System.out.println(shoulderWorkout.getDate());
		System.out.println(shoulderWorkout.getFocusArea());
		shoulderWorkout.listAllExercises();
		
        
        
        System.out.println("First Exercise: " + newExercise1.getName()); 
    }
}