package DSA.TCS.Latest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoePairs {
    public static int countPairs(List<String>list){
        Map<Integer,Integer>left=new HashMap<>();
        Map<Integer,Integer>right=new HashMap<>();
        for(String shoes:list){
            int size=Integer.parseInt(shoes.substring(0,shoes.length()-1));
            char type=shoes.charAt(shoes.length()-1);
            if(type=='L'){
                left.put(size,left.getOrDefault(size,0)+1);
            }
            else{
                right.put(size,right.getOrDefault(size,0)+1);
            }
        }
        int pairs=0;
        for(Integer size: left.keySet()){
            pairs+=Math.min(left.get(size),right.getOrDefault(size,0));
        }
        return pairs;
    }

    public static void main(String[] args) {
        List<String> shoes = Arrays.asList(
                "7L","7R","7L","8L","6R","7R","8R","6R");

        System.out.println(countPairs(shoes));

    }
}
/*
A person has many shoes of different sizes and wants to arrange them into pairs.
A pair consists of one left shoe (L) and one right shoe (R) of the same size.
Input N = 8 Shoes: 7L 7R 7L 8L 6R 7R 8R 6R
Output: 3
 */