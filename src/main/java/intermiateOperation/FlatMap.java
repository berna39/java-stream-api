package intermiateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    /*
     * a stream can hold complex data structures like Stream<List<String>>. In cases like this, 
     * flatMap() helps us to flatten the data structure to simplify further operations
     */
    public static void main(String[] args) {
        List<List<String>> squads = new ArrayList<>();
        squads.add(Arrays.asList("Declan Rice", "Martin Odegaard", "Gabriel Jesus"));
        squads.add(Arrays.asList("Jack Grealish", "John Stones", "Ruben Dias"));
        squads.add(Arrays.asList("Scott McTominay", "Bruno Fernades", "Raphael Varane"));

        System.out.println(squads); // list of lists

        Stream<List<String>> squadStream = squads.stream();
        Stream<String> flattenSquads = squadStream.flatMap(squad -> squad.stream()); // we return a stream of child elements
        System.out.println(flattenSquads.collect(Collectors.toList()));
    }
}
