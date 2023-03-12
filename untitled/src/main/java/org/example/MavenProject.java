package org.example;

import com.google.gson.Gson;

public class MavenProject {
    public static void main( String[] args )
    {
        String name = "John";
        String lastName = "Doe";

        Person person = new Person(name, lastName);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
