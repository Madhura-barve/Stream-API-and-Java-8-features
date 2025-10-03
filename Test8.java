//Remove duplicates

import java.util.Arrays;
import java.util.List;

public class Test8 {
    public static void main(String args[]){
        List<Integer> ls = Arrays.asList(1,2,3,2,4,4,5,7,7);
        List<Integer> newList = ls.stream()
                                  .distinct()
                                  .toList();
        System.out.println(newList);
    }
}
