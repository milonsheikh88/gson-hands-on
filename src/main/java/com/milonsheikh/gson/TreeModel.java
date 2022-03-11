package com.milonsheikh.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Arrays;

/**
 *
 * @author Milon
 */

public class TreeModel {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Car car = new Car("BMW", "X1", 2016, Arrays.asList("BLUE", "RED", "WHITE"));
        JsonElement jsonElement = gson.toJsonTree(car);
        
        System.out.println("To JSON: " + jsonElement);

        String jsonStr = jsonElement.toString();
        JsonElement rootNode = JsonParser.parseString(jsonStr);
        if (rootNode.isJsonObject()) {
            JsonObject carObject = rootNode.getAsJsonObject();

             String name = carObject.get("name").getAsString();
             String model = carObject.get("model").getAsString();
             int year = carObject.get("year").getAsInt();

            System.out.println("Name: " + name);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);

            JsonArray colorArray = carObject.getAsJsonArray("colors");
            for (int i = 0; i < colorArray.size(); i++) {
                String color = colorArray.get(i).getAsString();
                System.out.println("Color: " + color);
            }
        }
    }
}
