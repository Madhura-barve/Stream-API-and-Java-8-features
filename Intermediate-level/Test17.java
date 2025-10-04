// Find all duplicate elements in a list.
// 👉 Input: [1, 2, 3, 4, 2, 3, 5]
// 👉 Output: [2, 3]

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test17 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 2, 3, 5);
        List<Integer> result = nums.stream()
                                    .filter(n -> Collections.frequency(nums, n) > 1)
                                    .distinct()
                                    .toList();
        System.out.println(result);
    }
}
