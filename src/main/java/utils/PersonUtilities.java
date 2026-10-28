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
    public static Person[] removeBlanks(Person[] people){
        int blankCount = countBlank(people);
        Person[]result = new Person[people.length - blankCount];

        int resultIndex = 0;
        for(Person person : people) {
            if (person != null) {
                result[resultIndex] = person;
                resultIndex++;
            }
        }
        return result;
    }
    public static Person[] filtered(Person[] people) {
        if (people == null) {
            throw new IllegalArgumentException("The array must not be null.");
        }
        Person[] filtered = people.clone();

        for (int i = 0; i < filtered.length; i++) {
            if (filtered[i] == null) {
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (filtered[j] != null && filtered[i].equals(filtered[j])) {
                    filtered[i] = null;
                    break;
                }
            }
        }
        return removeBlanks(filtered);
    }
    public static Person[] sortedDeduplicate(Person[]people) {
        if (people == null) {
            throw new IllegalArgumentException("The array must not be null.");
        }
        if (people.length == 0) {
            return new Person[0];
        }
        int uniqueCount = 1;

        for (int i = 1; i < people.length; i++) {
            if (people[i].compareTo(people[i - 1]) != 0) {
                uniqueCount++;
            }
        }
        Person[] result = new Person[uniqueCount];
        result[0] = people[0];

        int resultIndex = 1;

        for (int i = 1; i < people.length; i++) {
            if (people[i].compareTo(people[i - 1]) != 0) {
                result[resultIndex] = people[i];
                resultIndex++;
            }
        }
        return result;
    }

}

