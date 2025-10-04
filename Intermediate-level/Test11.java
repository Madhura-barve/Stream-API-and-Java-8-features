// Find all strings longer than 5 characters from a list of strings.
// 👉 Input: ["java", "springboot", "stream", "api", "microservices"]
// 👉 Output: ["springboot", "microservices"]

import java.util.Arrays;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<String> str1 = Arrays.asList("java", "springboot", "stream", "api", "microservices");
        List<String>str2 = str1.stream()
                                .filter(s -> s.length()>5)
                                .toList();
        System.out.println(str2);
    }
}
