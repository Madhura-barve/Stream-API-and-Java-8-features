// Convert a list of strings to uppercase.
// Input: ["java", "spring", "api"] → Output: ["JAVA", "SPRING", "API"]

import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String args[]){
        List<String> ls = Arrays.asList("java", "spring", "api");
        List<String> newStr = ls.stream()
                                .map(String::toUpperCase)
                                .toList();
        System.out.println(newStr);
    }
}
