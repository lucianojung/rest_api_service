package de.lucianojung.restApiServerBE.model;

import java.util.Calendar;

public class User {

    private static User me;

    private final Calendar lastUpdated = new Calendar.Builder().setDate(2021,02,16).build();
    private final String name = "Jung";
    private final String firstName = "Luciano";
    private final String email = "LucianoJ@posteo.de";
    private final String website = "https://lucianojung.de/";
    private final String country = "Germany";
    private final String state = "Hesse";
    private final Calendar birthday = new Calendar.Builder().setDate(1998, 3, 1).build();
    private final String bio = "I am an enthusiastic full-stack developer with an experience focus in Java and a passion in app development. My strengths include team communication and my interest in new technologies.";
    private final String education = "Bachelor of science business informatics";
    private final String study = "Msc. business informatics at the university of darmstadt ";
    private final String work = "working student at the U2care GmbH";

    private User() {
    }

    public static User getMe(){
        if (me == null)
            me = new User();
        return me;
    }

    public Calendar getLastUpdated() {
        return lastUpdated;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getBio() {
        return bio;
    }

    public String getEducation() {
        return education;
    }

    public String getStudy() {
        return study;
    }

    public String getWork() {
        return work;
    }
}
