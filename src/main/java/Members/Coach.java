package Members;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Programs.NutritionProgram;
import Programs.WorkoutProgram;
import java.io.Serializable;
import java.util.List;

public class Coach extends User implements Serializable{
    private int numYearsExp;
    private List<Participant> participants;

    // Constructor
    public Coach(String name,String username, String password, Profile profile, int numYI,List<Participant> participants) {
        super(name,username, password, profile);
        this.participants = participants;
        this.numYearsExp=numYI;
    }

    public int getNumYearsExp() {
        return numYearsExp;
    }

    public void setNumYearsExp(int numYearsExp) {
        this.numYearsExp = numYearsExp;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    
    // Methods
    public void viewParticipantProfiles() {
        // Implement the logic to view participants' profiles
    }

    public void addWorkoutProgram(WorkoutProgram program) {
        // Implement the logic to add a workout program
    }

    public void addNutritionProgram(NutritionProgram program) {
        // Implement the logic to add a nutrition program
    }

    public void viewParticipantProgress(Participant participant) {
        // Implement the logic to view a participant's progress
    }
}
