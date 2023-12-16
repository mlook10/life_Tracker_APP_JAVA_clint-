package Programs;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Exercise implements Serializable{
    private String name;
    private String muscleGroup;
    private int repetitions;
    private int duration;

    // Constructor
    public Exercise(String name, String muscleGroup, int repetitions, int duration) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.repetitions = repetitions;
        this.duration = duration;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Exercise{" + "name=" + name + ", muscleGroup=" + muscleGroup + ", repetitions=" + repetitions + ", duration=" + duration + '}';
    }
    
}
