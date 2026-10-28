package apps;

import java.util.Arrays;
import utils.InputUtility;
import utils.PersonUtilities;

public class PersonDuplicateRemoval {
    public static void main(String[]args) {
        int count = InputUtility.getValidInteger("How many people would you like to enter ?");

        while (count < 0) {
            count = InputUtility.getValidInteger("The number cannot be negative. Enter it again: ");
        }

        Person[] people = new Person[count];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter details for person" + (i + 1) + ":");

            String firstName = InputUtility.getValidString("First name:");
            String lastName = InputUtility.getValidString("Last name :");
            int age = InputUtility.getValidInteger("Age:");

            people[i] = new Person(firstName, lastName, age);
        }
        System.out.println("original people:");
        displayPeople(people);

        Person[] uniquePeople = PersonUtilities.filtered(people);

        System.out.println("People after removing duplicate first names:");
        displayPeople(uniquePeople);
    }
    private static void displayPeople(Person[]people){
        for(Person person : people) {
            System.out.printf("%s %s, age %d%n",
                    person.getFirstName(),
                    person.getLastName(),
                    person.getAge());
        }
    }
}
