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

public class SpecializedNutritionProgram implements NutritionProgram,Serializable {
    private List<Meal> meals;

    // Constructor
    public SpecializedNutritionProgram() {
        this.meals = new ArrayList<>();
    }

    // Implement the methods from the NutritionProgram interface
    @Override
    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    @Override
    public void removeMeal(Meal meal) {
        meals.remove(meal);
    }

    @Override
    public String viewProgram() {
        // Implement the logic to view the specialized nutrition program
        String info="";
        for (Meal meal : meals) {
            info+=meal.toString() +"\n";
        }
        return info;
    }
}