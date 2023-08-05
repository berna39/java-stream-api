package intermiateOperation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {
    /*
     * this produces a new stream that contains elements of the original 
     * stream that pass a given test (specified by a Predicate)
     */
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(6, 2, 3, 4, 5, 34, 3, 11, 9, 13);
         // Filetering
        Stream<Integer> subStream = intStream.filter(value -> value > 10); // we pass a predicate to filter
        System.out.println(subStream.collect(Collectors.toList()));
    }
}
