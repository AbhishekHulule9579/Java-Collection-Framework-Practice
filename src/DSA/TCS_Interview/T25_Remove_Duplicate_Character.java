package DSA.TCS_Interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class T25_Remove_Duplicate_Character {
    public static void main(String[] args) {
        String str="programming";
        Set<Character>set=new LinkedHashSet<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }
        String result="";
        for(char c:set){
            result+=c;
        }
        System.out.println(result);
    }
}
