package collector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import quickDemo.Gender;
import quickDemo.Person;

public class Grouping {
    
    public static void main(String[] args) {
        Map<Gender, List<Person>> groupes = getPeople().stream().collect(Collectors.groupingBy(Person::getGender));
        System.out.println(groupes);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Alisson", 23, Gender.MALE));
    }
}
