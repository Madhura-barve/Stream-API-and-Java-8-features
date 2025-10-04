// Print all elements in a list using forEach and streams.
// Input: [1, 2, 3, 4, 5] → Output: 1 2 3 4 5

import java.util.Arrays;
import java.util.List;

class Test{
    public static void main(String args[]){
        List<Integer> ls = Arrays.asList(1,2,3,4,5);
        ls.stream().forEach(System.out::println);
    }
}
