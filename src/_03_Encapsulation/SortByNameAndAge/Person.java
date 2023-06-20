package _03_Encapsulation.SortByNameAndAge;

import java.util.StringJoiner;

public class Person {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public  String toString (){



        return String.format("%s %s is %d years old.",firstName, lastName, age );
    }



}
