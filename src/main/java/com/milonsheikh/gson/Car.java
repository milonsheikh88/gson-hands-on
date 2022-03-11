/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.milonsheikh.gson;

/**
 *
 * @author Milon
 */
import java.util.List;

public class Car {

    private String name;
    private String model;
    private int year;
    private List colors;

    public Car(String name, String model, int year, List colors) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.colors = colors;
    }
}