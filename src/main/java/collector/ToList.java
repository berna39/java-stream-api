package collector;

import java.util.List;

import quickDemo.Gender;
import quickDemo.Person;
import java.util.stream.Collectors;

public class ToList {
    
    public static void main(String[] args) {
        List<Person> peopleList = getPeople().stream().collect(Collectors.toList());
        System.out.println("List :" + peopleList);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Amama", 27, Gender.FEMALE),
                        new Person("koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
