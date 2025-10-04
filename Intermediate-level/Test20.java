// Partition numbers into even and odd using streams.
// 👉 Input: [1, 2, 3, 4, 5, 6]
// 👉 Output: {false=[1, 3, 5], true=[2, 4, 6]}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test20 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> result = nums.stream()
                                                 .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println(result);
    }
}
