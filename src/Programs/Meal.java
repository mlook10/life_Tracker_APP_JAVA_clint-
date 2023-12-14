package Programs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;

public class Meal  implements Serializable{
    private String name;
    private List<String> ingredients;
    private String nutritionalInfo;

    // Constructor
    public Meal(String name, List<String> ingredients, String nutritionalInfo) {
        this.name = name;
        this.ingredients = ingredients;
        this.nutritionalInfo = nutritionalInfo;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getNutritionalInfo() {
        return nutritionalInfo;
    }

    public void setNutritionalInfo(String nutritionalInfo) {
        this.nutritionalInfo = nutritionalInfo;
    }

    @Override
    public String toString() {
        return "Meal{" + "name=" + name + "\ningredients=" + ingredients + "\nnutritionalInfo=" + nutritionalInfo + '}';
    }
    
}