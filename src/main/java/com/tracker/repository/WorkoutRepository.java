package com.tracker.repository;

import java.util.ArrayList;
import java.util.List;

import com.tracker.model.Workout;

public class WorkoutRepository {

    private List<Workout> workoutDatabase = new ArrayList<>();

    public void addTOTheList( Workout workout){
        workoutDatabase.add(workout);
    }

    public List<Workout> findAll(){
        return this.workoutDatabase;
    }

    
}