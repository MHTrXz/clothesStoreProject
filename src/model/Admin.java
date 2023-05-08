package model;

import controller.AdminController;

public class Admin extends PreModel {

    private static final String file = "Admin.txt";

    public static AdminController getAdmin(String id) {
        String[] data = getById(id, file);
        if (data != null) {
            return new AdminController(id, data[1], data[1], data[1], data[1]);
        } else {
            return null;
        }
    }

    public static String login(String username, String password)
    {
        String[] allData = getAllData(file);
        for (String item: allData) {
            String[] data = item.split(",");
            if (data[2].equals(username) & data[3].equals(password)) return data[0];
        }
        return null;
    }

}
