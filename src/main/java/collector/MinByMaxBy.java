package collector;

import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.*;

import quickDemo.Gender;
import quickDemo.Person;

public class MinByMaxBy {
    
    public static void main(String[] args) {
        Person eldest = getPeople().stream().collect(maxBy(Comparator.comparing(Person::getAge))).get();
        System.out.println(eldest);

        Person youngest = getPeople().stream().collect(minBy(Comparator.comparing(Person::getAge))).get();
        System.out.println(youngest);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Amama", 27, Gender.FEMALE),
                        new Person("koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
