package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Jonny", "Rosenberg", 39);

        // Gson
        Gson gson = new Gson();

        // в JSON
        String json = gson.toJson(person);
        System.out.println(json);

        // JSON обратно в объект
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println(deserializedPerson);
    }
}
