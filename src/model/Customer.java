package model;

import controller.CustomerController;

public class Customer extends PreModel {

    private static final String file = "customer.txt";

    public static CustomerController getCustomer(String id) {
        String[] data = getById(id, file);
        if (data != null) {
            return new CustomerController(id, data[1], data[2], data[3], Integer.parseInt(data[4]));
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
