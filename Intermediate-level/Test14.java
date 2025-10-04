//Find words starting with "s"

import java.util.Arrays;
import java.util.List;

public class Test14 {
    public static void main(String[] args) {
        List<String> str1 = Arrays.asList("spring", "java", "stream", "hibernate", "sql");
        List<String> str2 = str1.stream()
                                .filter(str -> str.startsWith("s"))
                                .toList();
        System.out.println(str2);
    }
}
