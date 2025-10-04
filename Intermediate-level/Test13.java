// Find the second highest number in a list.
// 👉 Input: [5, 9, 11, 2, 8]
// 👉 Output: 9

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(5,9,11,2,8);
        int num = ls.stream()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .get();
        System.out.println(num);
    }
}
