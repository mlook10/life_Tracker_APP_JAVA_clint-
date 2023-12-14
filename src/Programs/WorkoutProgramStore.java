/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Programs;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hp
 */
public class WorkoutProgramStore implements Serializable {
    private static Map<String, WorkoutProgram> WP_map = new HashMap<String, WorkoutProgram>();
    static {
        WP_map.put("Cardio", new CardioProgram());
        WP_map.put("Strength", new StrengthProgram());
    }
    
      public static WorkoutProgram make(String type) {
        return WorkoutProgramStore.WP_map.get(type).clone();
     } 
}
