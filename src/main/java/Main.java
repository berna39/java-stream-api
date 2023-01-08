import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> li = getPeople();

        // Declarative approach in Java (Since Java 8)

        // Filter
        List<Person> females = li.stream().filter(p -> p.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        females.forEach(System.out::println);

        // Sorting
        List<Person> sorted = li.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        sorted.forEach(System.out::println);

        // Sorting reverse
        List<Person> reverseSorted = li.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        reverseSorted.forEach(System.out::println);

       // All match
        boolean allMatch = li.stream()
                                    .allMatch(p -> p.getAge() > 18);
        System.out.println(allMatch);

        // Any match
        boolean anyMatch = li.stream()
                                .anyMatch(p -> p.getAge() > 18);
        System.out.println(anyMatch);

        // None match
        boolean noneMatch = li.stream()
                                .noneMatch(p -> p.getAge() > 30);
        System.out.println(noneMatch);

        // Max
        Optional<Person> max =  li.stream()
                                    .max(Comparator.comparing(Person::getAge));
        System.out.println(max.get());

        // or I can do this
        li.stream().max(Comparator.comparing(Person::getAge)).ifPresent(p -> {
            System.out.println(p);
        });

        // Min
        Optional<Person> min =  li.stream()
                .min(Comparator.comparing(Person::getAge));
        System.out.println(min.get());

        // Avg
        List numbers = List.of(1, 2, 3, 4, 5);
        double avg = numbers.stream().mapToDouble(n -> Double.parseDouble(n.toString())).average().orElse(0.0);
        System.out.println(avg);

        // Grouping
        Map<Gender, List<Person>> groups = li.stream().collect(Collectors.groupingBy(Person::getGender));
        groups.forEach((group, people) -> {
            System.out.println(group);
            people.forEach(System.out::println);
            System.out.println();
        });
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
