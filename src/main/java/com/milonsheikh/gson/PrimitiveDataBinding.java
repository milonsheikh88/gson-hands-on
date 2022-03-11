package com.milonsheikh.gson;

import com.google.gson.Gson;
import java.util.Arrays;

/**
 *
 * @author Milon Sheikh
 */
public class PrimitiveDataBinding {

 public static void main(String[] args) {
        Gson gson = new Gson();
        String name = "Milon Sheikh";
        long rollNo = 102;
        boolean verified = true;
        String[] subjects = {"Java", "Dart", "Swift"};
        int[] marks = {100, 90, 85};

        //Serialization 
        System.out.println("{");
        System.out.println("Name: " + gson.toJson(name) + ",");
        System.out.println("RollNo: " + gson.toJson(rollNo) + ",");
        System.out.println("Verified: " + gson.toJson(verified) + ",");
        System.out.println("Subjects:" + gson.toJson(subjects) + ",");
        System.out.println("Marks:" + gson.toJson(marks));
        System.out.println("}");

        //De-serialization 
        name = gson.fromJson("\"Milon Sheikh\"", String.class);
        rollNo = gson.fromJson("102", Long.class);
        verified = gson.fromJson("true", Boolean.class);
        subjects = gson.fromJson("[\"Java\", \"Dart\", \"Swift\"]", String[].class);
        marks = gson.fromJson("[100,90,85]", int[].class);

        System.out.println("name: " + name);
        System.out.println("rollNo: " + rollNo);
        System.out.println("verified: " + verified);
        System.out.println("subjects:" + Arrays.toString(subjects));
        System.out.println("marks:" + Arrays.toString(marks));

    }
 
}
