package com.tracker.model;
public class Exercise{
    private String name;
    private String type; // HIIT or stregth
    private int sets;
    private int reps;
    private double caloriesBurnedPerSet;

    public Exercise(String name,String type,int sets,int reps,double caloriesBurnedPerSet){
        this.name = name;
        this.type = type;
        this.sets = sets;
        this.reps = reps;
        this.caloriesBurnedPerSet = caloriesBurnedPerSet;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setSets(int sets) {
        this.sets = sets;
    }
    public void setReps(int reps) {
        if(reps<0){
            throw new IllegalArgumentException("reps can not be a negative number.");
        }
        this.reps = reps;
    }
    public void setCaloriesBurnedPerSet(double caloriesBurnedPerSet) {
        this.caloriesBurnedPerSet = caloriesBurnedPerSet;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getSets() {
        return sets;
    }
    public int getReps() {
        return reps;
    }public double getCaloriesBurnedPerSet() {
        return caloriesBurnedPerSet;
    }
    @Override
    public String toString() {
        return "Exercise [name=" + name + ", type=" + type + ", sets=" + sets + ", reps=" + reps
                + ", caloriesBurnedPerSet=" + caloriesBurnedPerSet + "]";
    }

    

    
}