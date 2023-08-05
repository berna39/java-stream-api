package terminalOperation;

import java.util.List;

import quickDemo.Gender;
import quickDemo.Person;

public class ToArray {
    
    public static void main(String[] args) {
        Object[] people = getPeople().stream().toArray();
        System.out.println(people[0]);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Alisson", 23, Gender.MALE),
                        new Person("Toby", 25, Gender.MALE),
                        new Person("Zuena", 25, Gender.FEMALE),
                        new Person("Amama", 27, Gender.FEMALE),
                        new Person("Koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
