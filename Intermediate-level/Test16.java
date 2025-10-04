//Group names by length
// Input: ["Tom", "Jerry", "Anna", "Mike", "Bob"]
// Output: {3=[Tom, Bob], 4=[Anna, Mike], 5=[Jerry]}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test16 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Tom", "Jerry", "Anna", "Mike", "Bob");
        Map<Integer, List<String>> grp = str.stream()
                                            .collect(Collectors.groupingBy(String::length));
        System.out.println(grp);
    }
}
