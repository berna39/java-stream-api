package collector;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import quickDemo.Gender;
import quickDemo.Person;

public class ToCollection {
    
    public static void main(String[] args) {
        LinkedList<Person> peopleLinkedList = getPeople().stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println("LinkedList :" + peopleLinkedList);

        Vector<Person> peopleVector = getPeople().stream().collect(Collectors.toCollection(Vector::new));
        System.out.println("Vector :" + peopleVector);
    }

    static List<Person> getPeople() {
        return List.of(new Person("koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
