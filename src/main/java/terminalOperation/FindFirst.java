package terminalOperation;

import java.util.Comparator;
import java.util.List;

import quickDemo.Gender;
import quickDemo.Person;

public class FindFirst {
    public static void main(String[] args) {

        Person p = getPeople().stream()
                                .sorted(Comparator.comparing(Person::getAge).reversed())
                                .findFirst().get();
        System.out.println(p);
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
