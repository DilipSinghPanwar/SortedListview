package com.androiddevs;


public class ProfileModel {

    private String username;
    private double population;
    private int profilePic;

    public ProfileModel(String username, double population, int profilePic) {
        this.username = username;
        this.population = population;
        this.profilePic = profilePic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }
}