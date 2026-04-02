package DSA.TCS_Interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class T10_Remove_Duplicate_Word {
    public static void main(String[] args) {
        String str="Hello world Hello and and or";
        String[] str1=str.split(" ");
        Set<String>set=new LinkedHashSet<>();
        for(String str2:str1){
            set.add(str2);
        }
        System.out.println(set);
        String join1= String.join(" ",set);
        System.out.println(join1);
    }
}
