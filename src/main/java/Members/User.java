package Members;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public abstract class User implements Serializable{
    private String name;
    private String username;
    private String password;
    private Profile profile;

    // Constructor
    public User(String name,String username, String password, Profile profile) {
        this.name=name;
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
