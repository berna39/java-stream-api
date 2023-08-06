package collector;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import quickDemo.Gender;
import quickDemo.Person;

public class ToSet {
    
    public static void main(String[] args) {
        Set<Person> peopleSet = getPeople().stream().collect(Collectors.toSet());
        System.out.println("Set :" + peopleSet);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Alisson", 23, Gender.MALE));
    }
}
