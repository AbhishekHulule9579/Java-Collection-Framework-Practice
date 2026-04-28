package DSA.IBM;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class I2_String_Compression {
    public static void fix_Compressed(String str){
        Map<Character,Integer>map=new TreeMap<>();
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            i++;
            String num="";
            while(i<str.length() && Character.isDigit(str.charAt(i))){
                num += str.charAt(i);
                i++;
            }
            int count=Integer.parseInt(num);
            map.put(ch,map.getOrDefault(ch,0)+count);
        }
        StringBuilder result=new StringBuilder();
        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            for(int j=0;j< entry.getValue();j++){
                result.append(entry.getKey());
            }
        }
        System.out.println("The string is "+result.toString());

    }
    public static void main(String[] args) {
        String str="a5b4c3d2e1";
        fix_Compressed(str);
    }
}
/*
Consider a string, S, that is a series of characters, each followed by its frequency as an integer.
The string is not compressed correctly, so there may be multiple occurrences of the same character.

A properly compressed string will consist of one instance of
 each character in alphabetical order followed by the total count of that character within the string.
 */