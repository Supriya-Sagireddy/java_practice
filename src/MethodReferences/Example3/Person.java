package MethodReferences.Example3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

