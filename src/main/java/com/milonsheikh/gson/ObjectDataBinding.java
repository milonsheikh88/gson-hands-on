package com.milonsheikh.gson;

import com.google.gson.Gson;

/**
 *
 * @author Milon
 */
public class ObjectDataBinding {

    public static void main(String[] args) {

        Gson gson = new Gson();

        //Serialization 
        Address address = new Address("Bangladesh", "Dhaka");
        Employees employee = new Employees("Milon Sheikh", 32, "milon@gmail.com", address);
        String jsonStr = gson.toJson(employee);
        System.out.println("jsonStr: " + jsonStr);

        //De-serialization 
        Employees jsonEmployees = gson.fromJson(jsonStr, Employees.class);
        System.out.println("jsonEmployees: " + jsonEmployees.toString());
    }
}
