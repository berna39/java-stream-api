package collector;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import quickDemo.Gender;
import quickDemo.Person;

public class Averaging {
    
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = getPeople().stream()
                                                    .collect(Collectors.summarizingDouble(Person::getAge));
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Max : " + stats.getMax());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Count : " + stats.getCount());
        System.out.println("Sum : " + stats.getSum());
    }

    static List<Person> getPeople() {
        return List.of(new Person("Amama", 27, Gender.FEMALE),
                        new Person("koko", 17, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE));
    }
}
