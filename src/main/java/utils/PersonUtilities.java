package utils;

import apps.Person;
public class PersonUtilities {
    public static int countBlank(Person[]people) {
        if (people == null) {
            throw new IllegalArgumentException("the array must not be null");
        }
        int blankCount = 0;

        for (Person person : people) {
            if (person == null) {
                blankCount++;
            }
        }
        return blankCount;
    }
}

