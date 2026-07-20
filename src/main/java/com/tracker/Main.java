package com.tracker; // <-- Tells Java this is in the tracker folder

import com.tracker.model.Exercise; // <-- Tells Java where to find the Exercise model

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calisthenics and HIIT Tracker");

        Exercise newExercise = new Exercise("Muscle-Up", "Strength", 3, 12, 0);
        
        
        System.out.println("First Exercise: " + newExercise.getName()); 
    }
}