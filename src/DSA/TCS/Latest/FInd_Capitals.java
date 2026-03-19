package DSA.TCS.Latest;

import java.util.*;

public class FInd_Capitals {
    public static boolean isCapital(String str){
        if (str.equals(str.toUpperCase()))
            return true;
        if(str.equals(str.toLowerCase()))
            return true;
        if(Character.isUpperCase(str.charAt(0))
                && str.substring(1).equals(str.substring(1).toLowerCase()))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean result;
        result=isCapital(str);
        System.out.println(result);
    }
}
/*
We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
 */