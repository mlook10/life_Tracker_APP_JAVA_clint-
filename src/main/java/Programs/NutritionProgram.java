package Programs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public interface NutritionProgram {
    void addMeal(Meal meal);
    void removeMeal(Meal meal);
    String viewProgram();
}