package com.milonsheikh.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Milon
 */
public class UsefulAnnotations {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation().create();

        Student student = new Student(
                "Milon",
                30,
                "milon@mail.com",
                "012345678",
                "qwerty"
        );

        String jsonResult = gson.toJson(student);
        System.out.println("To json Result: " + jsonResult);
        Student stu = gson.fromJson(jsonResult, Student.class);
        System.out.println("From json Result: " + stu);
    }
}
