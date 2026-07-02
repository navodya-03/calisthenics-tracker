
package com.tracker.service;

import java.util.List;

import com.tracker.model.Workout;
import com.tracker.repository.WorkoutRepository;

public class WorkoutAnalyzer {

    private final WorkoutRepository Repo;

    public WorkoutAnalyzer(WorkoutRepository Repo){
        this.Repo = Repo;

    }

    

    public List<Workout> getWorkoutsByFocus(String focusArea){

       List<Workout> workoutstream = Repo.findAll().stream()
      
       .filter(workout -> workout.getFocusArea().equalsIgnoreCase(focusArea)).toList();
       
       return workoutstream;


    }



}



