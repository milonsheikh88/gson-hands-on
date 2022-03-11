package com.milonsheikh.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Milon
 */
public class Student {

    @Expose
    String name;
    @Expose(serialize = true, deserialize = false)
    int age;
    
    @Expose(serialize = false, deserialize = true)
    String email;
    
    @Expose
    @SerializedName("mobile")
    String phone;

    String password;

    public Student(String name, int age, String email, String phone, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + ", password=" + password + '}';
    }

}
