package DSA.TCS.Latest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestBalancedSubarray {
    public static int longestBalanced(List<Integer>arr){
        //Map<Integer,Integer>map=new HashMap<>();
        int countone=0,countzero=0;
        int maxlength=0;
        //map.put(0,-1);
        for(int i=0;i<arr.size();i++){
            for(int j=i;j<arr.size();j++) {

                if (arr.get(i)== 0) {
                    countzero++;
                } else
                    countone++;
                if (countzero == countone) {
                    int length =j-i+1;
                    maxlength=Math.max(maxlength,length);
                }
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        List<Integer>arr= Arrays.asList(1,0,0,1,1,0);
        System.out.println(longestBalanced(arr));
    }
}
/*
Imagine you are observing a sequence of binary responses (Os and 1s) from a group of people answering a survey.
:
O means No
1 means Yes
You want to find the longest continuous sequence where the number of Yes (1s) is equal to the number of No (0s).
This will help you identify the largest balanced segment in the survey responses.
Problem Statement
Given an array of Os and 1s, find the longest subarray that contains an equal number of Os and 1s.Examples:
Input: arr = [1, 0, 0, 1, 0, 1, 1]
Output: 6
Explanation:
The subarray: [0, 0, 1, 0, 1, 1]
contains an equal number of Os and 1s, and its length is 6.
 */
