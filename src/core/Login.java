package core;

import model.Admin;
import model.Customer;

public class Login 
{
    public static String[] typeUser(String username, String password)
    {
        String customer = Customer.login(username, password);
        String admin = Admin.login(username, password);
        String[] output = new String[2];
        if (customer != null) {
            output[0] = "customer";
            output[1] = customer;
            return output;
        } else if (admin != null) {
            output[0] = "admin";
            output[1] = admin;
            return output;
        } else {
            return null;
        }
    }
}
