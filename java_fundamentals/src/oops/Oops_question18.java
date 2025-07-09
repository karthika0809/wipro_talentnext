package oops;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Oops_question18 {
    public static void main(String[] args) {
        // Example ArrayList of names
        ArrayList<String> names = new ArrayList<>();
        //Scanner in=new Scanner(System.in);
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Create StringJoiner with comma as delimiter
        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        // Add each name to the joiner
        for (String name : names) {
            joiner.add(name);
        }

        // Convert to string
        String result = joiner.toString();

        // Output the result
        System.out.println(result);
    }
}