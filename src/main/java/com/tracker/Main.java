package com.tracker; // <-- Tells Java this is in the tracker folder

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.tracker.exception.InvalidExerciseCalorieBurned;
import com.tracker.exception.InvalidExerciseSets;
import com.tracker.exception.InvalidWorkoutDataException;
import com.tracker.model.Exercise; // <-- Tells Java where to find the Exercise model
import com.tracker.model.Workout;
import com.tracker.repository.WorkoutRepository;
import com.tracker.service.WorkoutAnalyzer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calisthenics and HIIT Tracker");
		Scanner scanner = new Scanner(System.in);
		
		

		int option = 0;
		while (true) {
			System.out.println("1. Add Workout");
			System.out.println("2. View All");
			System.out.println("3. Analyze");
			System.out.print("4. Exit");

			option = scanner.nextInt();
			scanner.nextLine();
			

			
			
			
			
			switch(option){
				case 1:
					Scanner workoutScanner = new Scanner(System.in);

					while (true) {

						System.out.println("enter the workout id: ");
						String id = workoutScanner.nextLine();

						System.out.println("enter the date: ");
						String date = workoutScanner.nextLine();

						System.out.println("enter the focus Area: ");
						String focusArea = workoutScanner.nextLine();

						Workout newWorkout = new Workout(id, date, focusArea);

						System.out.println("do you want to create another workout:[y/n] ");
						String input = workoutScanner.nextLine();

						if(input.equalsIgnoreCase("y")){
							continue;
						}else{
							System.out.println(newWorkout.toString());
							break;
						}
						
					}

					

					


					
					break;
				default:
					System.out.println("nothing enter a  number");		
						



						
					

						
						
		
			}
		}
	}

	public static void createExercise(){
		Scanner scanner = new Scanner(System.in);
		List <String> types = List.of("aerobic","strenght","flexibility","balance","metabolic");

		String name;
					while (true) {
						System.out.println("You have to create a Exercises in order to create a Workout!");
						System.out.println("Enter Exercise name: ");
						name = scanner.nextLine().toLowerCase();
						if(!name.matches("[a-z]+")){
							System.out.println("invalid input use only letters when creating the name!");
							continue;
						}else{
							break;
						}
					}	

					String type;
					while (true) {

						System.out.println("Enter the Exercise type(it should be one out of (aerobic,strenght,flexibility,balance,metabolic) ): ");
						type = scanner.nextLine().trim().toLowerCase();
						if (!types.contains(type)) {
							System.out.println("invalid input try one from the mentioned list");
							continue;
						}else{
							break;
						}
						
					}
					int input;
					while (true) {
						try {
							System.out.println("enter number of reps");
							input = scanner.nextInt();
							scanner.nextLine();
							
						
						}catch (Exception e) {
							System.out.println(e.toString());
							scanner.nextLine();
							continue;	
						}

						try{
							if (input<0) {
								throw new InvalidWorkoutDataException("wrong");
								
						}else{
							break;

						}
						
						}catch(InvalidWorkoutDataException e){
							System.out.println(e.toString());
						}
						
						
					}
				
					int sets;
					while (true) {
						System.out.println("Enter the number of sets");
						

						try{
							sets = scanner.nextInt();

						}catch(InputMismatchException e){
							System.out.println("wrong type of input insert a integer value");
							scanner.nextLine();
							continue;
						}

						try{
							if (sets<0) {
								throw new InvalidExerciseSets("this can not be negative enter positive value");
								
							}else{
								break;
							}
						}catch(InvalidExerciseSets e){
							System.out.println(e.toString());
							continue;
						}
					}
						double calories;
						while (true) {
							System.out.println("enter the number of calories burned: ");
							

							try{
								calories = scanner.nextDouble();

							}catch(InputMismatchException e){
								System.out.println(e.toString());
								scanner.nextLine();
								continue;
							}

							try{
								if (calories<0) {
									
									throw new InvalidExerciseCalorieBurned("invalid type try double value");
									
								}else{
									break;
								}


								}catch (InvalidExerciseCalorieBurned e){

									System.out.println(e.toString());
									continue;
							}
							
						}
						

						Exercise newExercise = new Exercise(name,type,sets,input,calories);
	}	
}


			
		

	

