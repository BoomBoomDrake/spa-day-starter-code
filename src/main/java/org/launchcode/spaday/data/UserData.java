package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.ArrayList;

public class UserData {
    private ArrayList<User> userList = new ArrayList<>();

    public ArrayList<User> getAll() {
        return userList;
    }

    public void add(User user) {
        userList.add(user);
    }

    public User getById(int id) {

        for ( User user : userList) {
            if (user.getId() == id) {

                return user;
            }
        }

        return null;
    }
}
