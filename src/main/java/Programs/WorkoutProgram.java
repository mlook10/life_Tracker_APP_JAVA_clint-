package Programs;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public interface WorkoutProgram {
    void addExercise(Exercise exercise);
    void removeExercise(Exercise exercise);
    String viewProgram();
    //prototype necessary methods
     public WorkoutProgram clone();    
     public String type();
}