package collector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import quickDemo.Gender;
import quickDemo.Person;

public class Partitioning {
    
    public static void main(String[] args) {
       Map<Boolean, List<Person>> groups = getPeople().stream().collect(Collectors.partitioningBy(p -> p.getAge() > 20));
       System.out.println(groups); 
    }

    static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Alisson", 23, Gender.MALE));
    }
}
