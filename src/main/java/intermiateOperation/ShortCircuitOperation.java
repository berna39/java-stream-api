package intermiateOperation;

import java.util.List;

import quickDemo.Gender;
import quickDemo.Person;

public class ShortCircuitOperation {
    /*
     * Short-circuiting operations allow computations on 
     * infinite streams to complete in finite time
     */
    public static void main(String[] args) {

        getPeople().stream().skip(2)
                            .limit(3) // Alisson, Toby, Amama
                            .forEach(System.out::println);
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
