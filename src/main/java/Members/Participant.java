package Members;

import Programs.CardioProgram;
import Programs.SpecializedNutritionProgram;
import Programs.StrengthProgram;
import Programs.WorkoutProgram;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Participant extends User implements Serializable{
    private Coach coach;
    private CardioProgram cardioProgram;
    private StrengthProgram strengthProgram;
    private SpecializedNutritionProgram snp;
    // Constructor
    public Participant(String name,String username, String password, Profile profile) {
        super(name,username, password, profile);
    }

    // Methods
    public void addHealthInformation() {
        // Implement the logic to add/update health information
    }

    public void selectCoach(Coach coach) {
        this.coach=coach;
    }

    public void setNutritionProgram(SpecializedNutritionProgram snp){
        this.snp=snp;
    }
    public void viewWorkoutProgram() {
        // Implement the logic to view the workout program
    }

    public String viewNutritionProgram() {
        if(getNutritionProgram()==null)
            return "";
        else
             return getNutritionProgram().viewProgram(); 
    }

    public void confirmDailyAchievements() {
        // Implement the logic to confirm daily achievements
        getProfile().increaseProgress();
    }

    public void viewPersonalProgress() {
        // Implement the logic to view personal progress
    }

    public void viewFitnessProgressHistory() {
        // Implement the logic to view fitness progress history
    }

    public Coach getCoach() {
        return coach;
    }

    public SpecializedNutritionProgram getNutritionProgram() {
        return snp;
    }

    public CardioProgram getCardioProgram() {
        return cardioProgram;
    }

    public void setCardioProgram(CardioProgram cardioProgram) {
        this.cardioProgram = cardioProgram;
    }

    public StrengthProgram getStrengthProgram() {
        return strengthProgram;
    }

    public void setStrengthProgram(StrengthProgram strengthProgram) {
        this.strengthProgram = strengthProgram;
    }
    
    
}