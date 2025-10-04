//Join list of strings with commas
// Input: ["java", "spring", "api"]
// Output: "java,spring,api"

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test18 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("java", "spring", "api");
        String result = str.stream()
                            .collect(Collectors.joining(","));
        System.out.println(result);                    
    }
}
