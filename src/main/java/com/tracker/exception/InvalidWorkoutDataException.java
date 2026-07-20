package com.tracker.exception;

public class InvalidWorkoutDataException extends RuntimeException {

    public InvalidWorkoutDataException(String message){
        super(message);
    }
    
}
