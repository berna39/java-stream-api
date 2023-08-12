package collector;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import static java.util.stream.Collectors.*;

import quickDemo.Gender;
import quickDemo.Person;

public class Grouping {
    
    public static void main(String[] args) {
        // using groupingBy(classifier)
        Map<Gender, List<Person>> groupes = getPeople().stream().collect(groupingBy(Person::getGender));
        System.out.println(groupes);

        // using groupingBy(classifier, collector)
        Map<Gender, Map<String, Integer>> mapGroups = getPeople().stream()
                                                        .collect(groupingBy(Person::getGender, toMap(Person::getName, Person::getAge)));
        System.out.println(mapGroups);

        // using groupingBy(classifier, supplier, collector)
        /*
         * provides a new empty Map into which the results will be inserted. 
         * By default, HashMap::new is used. We can use other maps such as TreeMap, 
         * LinkedHashMap or ConcurrentMap to insert additional behavior in the grouping
         * process such as sorting.
         */
        TreeMap<Integer, Map<String, Gender>> treeMapGroups = getPeople().stream()
                                                        .collect(groupingBy(Person::getAge, TreeMap::new, toMap(Person::getName, Person::getGender)));
        System.out.println(treeMapGroups);
        System.out.println(treeMapGroups.getClass());
    }

    static List<Person> getPeople() {
        return List.of(new Person("Toto", 22, Gender.MALE),
                        new Person("Titi", 19, Gender.MALE),
                        new Person("Dadu", 25, Gender.FEMALE),
                        new Person("Alisson", 23, Gender.MALE));
    }
}
