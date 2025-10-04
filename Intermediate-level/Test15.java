// Count the frequency of each character in a string.
// 👉 Input: "banana"
// 👉 Output: {b=1, a=3, n=2}

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test15 {
    public static void main(String[] args) {
        String str = "banana";
        Map<Character, Long> freqMap = str.chars()
                                            .mapToObj(c -> (char)c)
                                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqMap);
    }
}
