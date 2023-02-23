package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.ArrayList;

public class UserData {
    private static ArrayList<User> userList = new ArrayList<>();

    public static ArrayList<User> getAll() {
        return userList;
    }

    public static void add(User user) {
        userList.add(user);
    }

    public static User getById(int id) {

        for ( User user : userList) {
            if (user.getId() == id) {

                return user;
            }
        }

        return null;
    }
}
