package Programs;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class StrengthProgram implements WorkoutProgram, Serializable {
    private List<Exercise> exercises;
    private int Weight;
    private int MonthlyReps;
    // Constructor
    public StrengthProgram() {
        this.exercises = new ArrayList<>();
    }
@Override
    public WorkoutProgram clone() {
        return new StrengthProgram();
    }

    @Override
    public String type() {
        return "Type is Strength";
    }
    // Implement the methods from the WorkoutProgram interface
    @Override
    public void addExercise(Exercise exercise) {
        // Implement the logic to add a strength exercise to the program
        exercises.add(exercise);
    }

    @Override
    public void removeExercise(Exercise exercise) {
        // Implement the logic to remove a strength exercise from the program
    }

    @Override
    public String viewProgram() {
        // Implement the logic to view the strength program
        String info="";
        info+=("Weight: "+Weight)+"\n";
        info+=("Monthly Repsitition: "+MonthlyReps)+"\n";
        info+="Exercises:\n";
        for (Exercise exercise : exercises) {
            info+=(exercise.toString())+"\n";
        }
        return info;
    }

    // Additional methods specific to strength exercises
    public void setWeight(int weight) {
        this.Weight=weight;
    }

    public void setMonthlyReps(int reps) {
        this.MonthlyReps=reps;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public int getWeight() {
        return Weight;
    }

    public int getMonthlyReps() {
        return MonthlyReps;
    }
    
}