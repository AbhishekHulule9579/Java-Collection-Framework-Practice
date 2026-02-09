package List;

import java.util.Arrays;
import java.util.List;

public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>>num= Arrays.asList(
          Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        List<Integer>flatList=num.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flatList);
    }
}
