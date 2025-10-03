// Find the maximum number in a list.
// Input: [10, 20, 5, 30] → Output: 30

import java.util.Arrays;
import java.util.List;

public class Test7 {
    public static void main(String args[]){
        List<Integer> ls = Arrays.asList(10, 20, 5, 30);
        int newList = ls.stream()
                        .max(Integer::compareTo)
                        .get();
        System.out.println(newList); 
    }
}
