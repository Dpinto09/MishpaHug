package com.telRan.Mishpahug.model;

public class ProfileAboutMySelfData {
    private String status;
    private String foodPref;
    private String gender;
    private String language;
    private String text;


    public ProfileAboutMySelfData setStatus(String status) {
        this.status = status;
        return this;
    }

    public ProfileAboutMySelfData setFoodPref(String foodPref) {
        this.foodPref = foodPref;
        return this;
    }

    public ProfileAboutMySelfData setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public ProfileAboutMySelfData setLanguage(String language) {
        this.language = language;
        return this;
    }

    public ProfileAboutMySelfData setText(String text) {
        this.text = text;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public String getFoodPref() {
        return foodPref;
    }

    public String getGender() {
        return gender;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }
}
