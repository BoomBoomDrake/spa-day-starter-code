package org.launchcode.spaday.models;

import java.util.Date;

public class User {

    private int id;
    private static int nextId = 1;
    private Date dateJoined;
    private String username;
    private String email;
    private String password;

    public User() {
        id = nextId;
        nextId++;
        dateJoined = new Date();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
