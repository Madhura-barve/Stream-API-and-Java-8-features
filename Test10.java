//Sum all elements using reduce

import java.util.Arrays;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(2,3,4,1,5,0);
        int sum = ls.stream()
                    .reduce(0, (a,b) -> a+b);
        System.out.println(sum);
    }
}
