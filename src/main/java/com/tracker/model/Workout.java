package com.tracker.model;

import java.util.Arrays;
import java.util.List;

public class Workout {

    private String id;
    private String date;
    private String focusArea;

    public Exercise [] exercises = new Exercise[10];

    public void addExercises(Exercise exercise){
        for(int i=0; i< exercises.length-1;i++){
            if (exercises[i] == null) {
                exercises[i] = exercise;
                System.out.println(exercise.getName()+" added to the list of Exercises");
                return;
            }
        }
        
        
    }
    public void listAllExercises(){
        System.out.println("\n ---- List of Exercises ---- \n");
        for(Exercise a:exercises){
            if (a != null) {
                System.out.println(a.getName()); 
            }
            
        }
    }

    

    public Workout(String id,String date,String focusArea){
        this.id = id;
        this.date = date;
        this.focusArea = focusArea;
    }

    public String getDate() {
        return date;
    }
    
    public String getFocusArea() {
        return focusArea;
    }
    public String getId() {
        return id;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setFocusArea(String focusArea) {
        this.focusArea = focusArea;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Workout [id=" + id + ", date=" + date + ", focusArea=" + focusArea + ", exercises="
                + Arrays.toString(exercises) + "]";
    }

    
}