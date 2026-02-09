package List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(10,99,4,45,78,98,63,100);
        int secondHighest=numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()->new RuntimeException("Not enough element found"));
        System.out.println("The second highest number is "+secondHighest);
    }
}
