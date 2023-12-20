package Members;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Profile implements Serializable{
    private String healthInformation;
    private String goals;
    private int progress;

    // Constructor
    public Profile(String healthInformation, String goals, int progress) {
        this.healthInformation = healthInformation;
        this.goals = goals;
        this.progress = progress;
    }

    // Getters and setters
    public String getHealthInformation() {
        return healthInformation;
    }

    public void setHealthInformation(String healthInformation) {
        this.healthInformation = healthInformation;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void increaseProgress() {
        this.progress++;    
    }
}