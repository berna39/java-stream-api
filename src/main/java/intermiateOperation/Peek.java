package intermiateOperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {
    /*
     * something that ends up being processed inside peek might not be eligible for the terminal operation
     * at all and streams are executed only by a terminal operation.
     */
    public static void main(String[] args) {
        List<String> data = Stream.of("one", "two", "three", "four")
                .peek(String::toUpperCase) // this won't affect the Stream at the terminal operation
                .collect(Collectors.toList());
        System.out.println(data);
    }
}
