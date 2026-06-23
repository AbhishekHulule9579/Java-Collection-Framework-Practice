package DSA.TCS.Latest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cars_Monitoring {
    public static int count(List<Character> list) {
        Map<Character, Integer> map = new HashMap<>();
        int invalid = 0;

        for (char car : list) {
            map.put(car, map.getOrDefault(car, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                invalid++;
            }
        }

        return invalid;
    }
    public static void main(String[] args) {
        List<Character> cars =
                Arrays.asList('A','B','C','E','E','A','A','B','B','B','B','C','D','O','O','S');
        System.out.println(count(cars));
    }
}
