package intermiateOperation;

import java.util.stream.Stream;

public class Distinct {
    /*
     * distinct() does not take any argument and returns the distinct elements in the stream,
     * eliminating duplicates. It uses the equals() method of the elements to decide whether 
     * two elements are equal or not
     */
    public static void main(String[] args) {
        Stream<String> fruitsStream = Stream.of("Madrid", "Ajax", "Milan", "Liverpool", "Madrid");
        Stream<String> distinctStream = fruitsStream.distinct(); // just like this
        distinctStream.forEach(name -> System.out.println(name));
    }
}
