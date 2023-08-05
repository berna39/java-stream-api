package intermiateOperation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {
    /*
     * produces a new stream after applying a function to each element
     * of the original stream
     */
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Joe", "King", "Toby", "Adenkule", "Dadu", "Thibaut", "Youss");
        Stream<String> upperCaseNameStream = nameStream.map(name -> name.toUpperCase());
        System.out.println(upperCaseNameStream.collect(Collectors.toList()));
    }
}
