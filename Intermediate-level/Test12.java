// Find the average of a list of numbers.
// 👉 Input: [10, 20, 30, 40]
// 👉 Output: 25.0

import java.util.Arrays;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 20, 30, 40);
        double avg = ls.stream()
                    .mapToDouble(Integer::intValue)
                    .average()
                    .getAsDouble();
        System.out.println(avg);
    }
}
