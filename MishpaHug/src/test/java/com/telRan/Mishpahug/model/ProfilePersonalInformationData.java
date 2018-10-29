package com.telRan.Mishpahug.model;

public class ProfilePersonalInformationData {
    private String fName;
    private String lName;
    private String phone;
    private String religious;
    private String year;
    private String month;
    private String day;

    public ProfilePersonalInformationData setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public ProfilePersonalInformationData setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public ProfilePersonalInformationData setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ProfilePersonalInformationData setReligious(String religious) {
        this.religious = religious;
        return this;
    }

    public ProfilePersonalInformationData setYear(String year) {
        this.year = year;
        return this;
    }

    public ProfilePersonalInformationData setMonth(String month) {
        this.month = month;
        return this;
    }

    public ProfilePersonalInformationData setDay(String day) {
        this.day = day;
        return this;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPhone() {
        return phone;
    }

    public String getReligious() {
        return religious;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}
