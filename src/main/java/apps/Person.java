package apps;

import java.util.Objects;
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Person)) {
            return false;
        }
        Person person = (Person) other;
        return age == person.age
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, age );
    }
}
