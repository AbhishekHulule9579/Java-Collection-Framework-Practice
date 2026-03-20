package DSA.TCS.Problem_On_Number;

import java.util.Scanner;

public class Count_Ones_Substring {
    public static int countOne(String str){
        int result=0;
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
                result +=count;
            }
            else{
                count=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(countOne(str));
    }
}
/*
Given a binary string s, return the number of substrings with all characters
1's +
Example 1:
Input: s = "0110111"
Output: 9
Explanation: There are 9 substring in total with only 1's characters.
"1" -> 5 times.
"11" -> 3 times.
"111" -> 1 time.
 */