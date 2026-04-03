package DSA.TCS_Interview;

import java.util.HashMap;

public class T12_Longest_Subarray_0 {
    public static int maxLen(int[] arr){
        int maxlen=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];

            if(sum==0){
                maxlen=i+1;
            }
            if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
            }
            else
                map.put(sum,i);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        int result = maxLen(arr);
        System.out.println(result);
    }
}
