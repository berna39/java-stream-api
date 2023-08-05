package intermiateOperation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import quickDemo.Gender;
import quickDemo.Person;

import java.util.Comparator;
import java.util.List;

public class Sorted {
    
    public static void main(String[] args) {

        Stream<String> squad = Stream.of("toto", "titi", "tata");
        List<String> sortedSquad = squad.sorted().collect(Collectors.toList()); // it will sort by using the natural order
        System.out.println(sortedSquad);

        // using comparator
        List<Person> peopleSorted = getPeople().stream()
                                                .sorted(Comparator.comparing(Person::getAge))
                                                .collect(Collectors.toList());
        System.out.println(peopleSorted);
    }

    private static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Alisson", 23, Gender.MALE),
                        new Person("Toby", 25, Gender.MALE),
                        new Person("Amama", 27, Gender.FEMALE),
                        new Person("koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
