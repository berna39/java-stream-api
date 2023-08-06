package collector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining {
    
    public static void main(String[] args) {
        String meme = Stream.of("HA", "KU", "NA", " ","MA", "TA", "TA")
                            .collect(Collectors.joining());
        System.out.println(meme); // :)
    }
}
