package DSA.TCS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Longest_SubString {
    public static int lengthOfLongestSubString(String str){
        Set<Character>set=new HashSet<>();
        int left=0;
        int maxlength=0;
        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(lengthOfLongestSubString(str));
    }
}
/*
Q-Longest Substring without repeating characters
Problem Statement:
Given a string S, find the length of the longest substring without repeating characters.
A substring is a contiguous sequence of characters within a string.
Input Format:
A single string S.
Output Format:
Print a single integer representing the length of the longest substring without repeating characters.
Constraints:
1 ≤ length of S <= 10 ^ 5
String contains printable ASCII characters.
Sample Input 1:
abcabcbb
Sample Output 1:
3
Explanation
The longest substring without repeating characters is: abc Length = 3
 */