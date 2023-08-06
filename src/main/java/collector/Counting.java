package collector;

import java.util.List;
import java.util.stream.Collectors;

import quickDemo.Gender;
import quickDemo.Person;

public class Counting {
    
    public static void main(String[] args) {
        Long count = getPeople().stream().collect(Collectors.counting());
        System.out.println(count);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Amama", 27, Gender.FEMALE),
                        new Person("koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
