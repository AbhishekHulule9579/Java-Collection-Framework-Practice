package DSA.HashMap;

import java.util.*;

class TwoSumArray {
    public static List<int[]> findtargetindex(int[] arr,int target){
        Map<Integer,Integer> maps=new HashMap<>();
        List<int[]>result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(maps.containsKey(complement)){
                result.add(new int[]{complement,arr[i] });
            }
            maps.put(arr[i],i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=9;
        List<int[]> result=findtargetindex(arr,target);
        for(int[] pair:result){
            System.out.println(Arrays.toString(pair));
        }
    }
}

// two sum array and return the possible number