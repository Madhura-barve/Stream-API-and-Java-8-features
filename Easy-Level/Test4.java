// Count how many strings start with "A".
// 👉 Input: ["Apple", "Banana", "Avocado", "Mango"] → Output: 2

import java.util.Arrays;
import java.util.List;

public class Test4 {
    public static void main(String args[]){
        List<String> ls = Arrays.asList("Apple", "Banana", "Avocado", "Mango");
        long newList = ls.stream()
                    .filter(n-> n.startsWith("A"))
                    .count();
        System.out.println(newList);
    }
}
