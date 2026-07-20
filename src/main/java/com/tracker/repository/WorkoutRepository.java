package com.tracker.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tracker.model.Workout;

public class WorkoutRepository {

    private Map <String,Workout> workoutDatabase = new HashMap<>();

    public void save(String id, Workout workout){
        workoutDatabase.put(id, workout);
    }
    public Workout findById(String id){
        return this.workoutDatabase.get(id);

    }

    public List<Workout> findAll(){
        List <Workout> woroutData = new ArrayList<>(this.workoutDatabase.values()); 
        return  woroutData;
    }

    
}