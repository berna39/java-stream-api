package terminalOperation;

import java.util.Comparator;
import java.util.List;

import quickDemo.Gender;
import quickDemo.Person;

public class MinMax {
    
    public static void main(String[] args) {
        
        Person elder = getPeople().stream()
                                    .max(Comparator.comparing(Person::getAge)).get(); 
        System.out.println(elder);

        Person otherElder = getPeople().stream()
                                        .max((p1, p2) -> p1.getAge() - p2.getAge()) // using arithmetic operation
                                        .get();
        System.out.println(otherElder);

        // compareTo() method compares two strings lexicographically
        Person lastOne = getPeople().stream()
                                    .max((p1, p2) -> p2.getName().compareTo(p1.getName()))
                                    .get();
        System.out.println(lastOne);
    }

    static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Alisson", 23, Gender.MALE),
                        new Person("Toby", 25, Gender.MALE),
                        new Person("Zuena", 25, Gender.FEMALE),
                        new Person("Amama", 27, Gender.FEMALE),
                        new Person("Koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
