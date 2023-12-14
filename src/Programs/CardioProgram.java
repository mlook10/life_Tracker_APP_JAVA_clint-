package Programs;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class CardioProgram implements WorkoutProgram, Serializable {
    private List<Exercise> exercises;
    private int ProgDuration;
    private int IntensityLevel;
    // Constructor
    public CardioProgram() {
        this.exercises = new ArrayList<>();
    }
   @Override
    public WorkoutProgram clone() {
        return new CardioProgram();
    }

    @Override
    public String type() {
        return "Type is Cardio";
    }
    // Implement the methods from the WorkoutProgram interface
    @Override
    public void addExercise(Exercise exercise) {
        // Implement the logic to add a cardio exercise to the program
        exercises.add(exercise);
    }

    @Override
    public void removeExercise(Exercise exercise) {
        // Implement the logic to remove a cardio exercise from the program
        exercises.remove(exercise);
    }

    @Override
    public String viewProgram() {
        // Implement the logic to view the cardio program
        String info="";
        info+=("ProgDuration: "+ProgDuration)+"\n";
        info+=("Intensity level: "+IntensityLevel)+"\n";
        info+="Exercises:\n";
        for (Exercise exercise : exercises) {
            info+=(exercise.toString())+"\n";
        }
        return info;
    }

    // Additional methods specific to cardio exercises
    public void setIntensityLevel(int intensityLevel) {
        this.IntensityLevel=intensityLevel;
    }
    //set Duration of whole program
    public void setProgDuration(int duration) {
        this.ProgDuration=duration;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public int getProgDuration() {
        return ProgDuration;
    }

    public int getIntensityLevel() {
        return IntensityLevel;
    }

 
    
}