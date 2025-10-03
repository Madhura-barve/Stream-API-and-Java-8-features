// Filter even numbers from a list.
// Input: [1, 2, 3, 4, 5, 6] → Output: [2, 4, 6]

import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String args[]){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
        List<Integer> filterList = ls.stream()
                                     .filter(n -> n%2 ==0)
                                     .toList();
        System.out.println(filterList);
    }
}
