//Find first element

import java.util.Arrays;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(30,20,10,44,29);
        int first = ls.stream()
                      .findFirst()
                      .get();
        System.out.println(first);
    }
}
