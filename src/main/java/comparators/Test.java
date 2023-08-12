package comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import quickDemo.Gender;
import quickDemo.Person;

public class Test {

    /*
     *  To compare, we need to know what's factors to use, this can be natural order,
     *  or we can define custom comparaison either by implementing Comparable<T> interface
     *  or using a lambda expression
     * 
     *  Concepts:
     *      - Comparable : Comparable is an interface defining a strategy of comparing an object with
     *                     other objects of the same type. This is called the class's “natural ordering
     *      
     *      - Comparator : The Comparator interface defines a compare(arg1, arg2) method with two arguments 
     *                      that represent compared objects, and works similarly to the Comparable.compareTo() method.
     * 
     *   So why use a Comparator if we already have Comparable?
     * 
     *   There are several reasons why:
     *       
     *   - Sometimes we can't modify the source code of the class whose objects we want to sort, thus making the use of Comparable impossible
     *   - Using Comparators allows us to avoid adding additional code to our domain classes
     *   - We can define multiple different comparison strategies, which isn't possible when using Comparable
     */
    
    public static void main(String[] args) {
        // First Example -> the Player class implements the Comparable Interface
        List<Player> players = getPlayers();
        Collections.sort(players);
        System.out.println(players);

        System.out.println("==================");

        // Second Example -> the Person class doesn't implement Comparable
        List<Person> people = getPeople();
        Collections.sort(people, Comparator.comparing(Person::getAge));
        System.out.println(people);

        System.out.println("==================");

        // Since java 8, I can even declare my comparator
        Comparator<Person> comparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        List<Person> otherPeople = getPeople();
        Collections.sort(otherPeople, comparator);
        System.out.println(otherPeople);
    }

    static List<Player> getPlayers() {
        return Arrays.asList(new Player("Declan Rice", 1, 24),
                            new Player("Martin Oodegaard", 4, 23),
                            new Player("Smith Rowe", 6, 20),
                            new Player("Eddie Nketiah", 4, 21));
    }

    static List<Person> getPeople() {
        return Arrays.asList(new Person("Amama", 27, Gender.FEMALE),
                        new Person("koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
