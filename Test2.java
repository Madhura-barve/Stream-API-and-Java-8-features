// Square each number in a list.
// 👉 Input: [1, 2, 3, 4] → Output: [1, 4, 9, 16]

import java.util.Arrays;
import java.util.List;

public class Test2 {
    
    public static void main(String args[]){
    List<Integer> nums2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> squares = nums2.stream()
                                     .map(n -> n * n)
                                     .toList();
        System.out.println(squares);
    }
}
