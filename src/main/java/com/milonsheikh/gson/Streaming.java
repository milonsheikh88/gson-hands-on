package com.milonsheikh.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Milon
 */
public class Streaming {

    public static void main(String[] args) {
        streamingWriter();
        
        streamingReader();

    }

    private static void streamingWriter() {

        JsonWriter writer;
        try {
            writer = new JsonWriter(new FileWriter("result.json"));

            writer.beginObject();
            writer.name("name").value("AUDI");
            writer.name("model").value(2014);
            writer.name("price").value(30000);

            writer.name("colors");
            writer.beginArray();
            writer.value("GRAY");
            writer.value("BLACK");
            writer.value("WHITE");
            writer.endArray();

            writer.endObject();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void streamingReader() {
        JsonReader reader;
        try {
            reader = new JsonReader(new FileReader("result.json"));
            reader.beginObject();

            while (reader.hasNext()) {
                String name = reader.nextName();

                if (name.equals("name")) {
                    System.out.println(reader.nextString());
                } else if (name.equals("model")) {
                    System.out.println(reader.nextInt());
                } else if (name.equals("price")) {
                    System.out.println(reader.nextDouble());
                } else if (name.equals("colors")) {

                    // it's an array.
                    reader.beginArray();
                    while (reader.hasNext()) {
                        System.out.println(reader.nextString());
                    }
                    reader.endArray();
                } else {// unexpected value, skip it or generate error
                    reader.skipValue();
                }
            }

            reader.endObject();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
