package collector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import quickDemo.Gender;
import quickDemo.Person;

public class ToMap {
    

    public static void main(String[] args) {
        Map<String, Integer> peopleMap = getPeople().stream()
                                                    .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println(peopleMap);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Alisson", 23, Gender.MALE));
    }
}
