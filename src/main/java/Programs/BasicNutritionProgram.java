package Programs;


import Programs.NutritionProgram;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class BasicNutritionProgram implements NutritionProgram, Serializable {
    private List<Meal> meals;

    // Constructor
    public BasicNutritionProgram() {
        this.meals = new ArrayList<>();
    }

    // Implement the methods from the NutritionProgram interface
    @Override
    public void addMeal(Meal meal) {
        // Implement the logic to add a meal to the basic nutrition program
    }

    @Override
    public void removeMeal(Meal meal) {
        // Implement the logic to remove a meal from the basic nutrition program
    }

    @Override
    public String viewProgram() {
        // Implement/ the logic to view the basic nutrition program
        return "";
    }
}
