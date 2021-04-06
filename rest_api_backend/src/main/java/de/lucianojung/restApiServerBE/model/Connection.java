package de.lucianojung.restApiServerBE.model;

public class Connection {

    private final String name;
    private final String userName;
    private final String link;
    private final ConnectionCategoryEnum category;

    public Connection(String name, String link, ConnectionCategoryEnum category) {
        this.name = name;
        this.userName = "";
        this.link = link;
        this.category = category;
    }

    public Connection(String name, String userName, String link, ConnectionCategoryEnum category) {
        this.name = name;
        this.userName = userName;
        this.link = link;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getLink() {
        return link;
    }

    public ConnectionCategoryEnum getCategory() {
        return category;
    }
}
