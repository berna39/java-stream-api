package terminalOperation;

import java.util.List;

import quickDemo.Gender;
import quickDemo.Person;

public class Count {
    
    public static void main(String[] args) {
        
        long majors = getPeople().stream()
                                .filter(p -> p.getAge() >= 25)
                                .count();
        System.out.println(majors);
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
