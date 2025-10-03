// Sort numbers in ascending order using streams.
// Input: [5, 1, 8, 2, 3] → Output: [1, 2, 3, 5, 8]

import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String args[]){
        List<Integer> ls = Arrays.asList(5,1,8,2,3);
        List<Integer> newList = ls.stream()
                                  .sorted()
                                  .toList();
        System.out.println(newList);
    }
}
