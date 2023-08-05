package terminalOperation;

import java.util.List;
import quickDemo.Gender;
import quickDemo.Person;

public class AllMatch {
    
    public static void main(String[] args) {
        boolean allMajor = getPeople().stream().allMatch(p -> p.getAge() > 18);
        System.out.println(allMajor);

        allMajor = getPeople().stream()
                                .filter(p -> p.getAge() >= 18)
                                .allMatch(p -> p.getAge() >= 18);
        System.out.println(allMajor); // after filtering :) true
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
