package MethodReferences.Example3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "Doe"));
        persons.add(new Person("Alice", "Smith"));
        persons.add(new Person("Bob", "Johnson"));

        // Use a method reference to obtain a list of full names
        List<String> fullNames = persons.stream()
                .map(Person::getFullName)
                .collect(Collectors.toList());

        // Display the list of full names
        for (String fullName : fullNames) {
            System.out.println(fullName);
        }
    }
}
