package terminalOperation;

import java.util.List;

import quickDemo.Gender;
import quickDemo.Person;

public class AnyMatch {
    
    public static void main(String[] args) {
        boolean isThereAnyMajor = getPeople().stream().anyMatch(p -> p.getAge() > 19);
        System.out.println(isThereAnyMajor);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Alisson", 23, Gender.MALE),
                        new Person("Toby", 25, Gender.MALE),
                        new Person("Amama", 27, Gender.FEMALE),
                        new Person("koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
