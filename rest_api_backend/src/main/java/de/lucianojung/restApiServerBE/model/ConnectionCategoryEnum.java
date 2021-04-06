package de.lucianojung.restApiServerBE.model;

public enum ConnectionCategoryEnum {

    SOCIALMEDIA("Social Media"), MAIL("Mail"), WEBSITE("Website"), PROJECT("Project");

    public final String name;

    ConnectionCategoryEnum(String name) {
        this.name = name;
    }
}