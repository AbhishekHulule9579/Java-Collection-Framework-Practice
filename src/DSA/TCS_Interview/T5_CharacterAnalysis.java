package DSA.TCS_Interview;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class T5_CharacterAnalysis {
    public static void main(String[] args) {
        String str="programming";
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println("Character occurence");
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }

        System.out.println();

        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("first non occuring element "+entry.getKey());
                break;
            }
        }
        char ch='\0';
        int max=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
                ch=entry.getKey();
            }

        }
        System.out.println();
        System.out.println("character: "+ch+" occures "+ max+" times");
        System.out.println();


        System.out.println("Remove duplicate characters from a String");


        Set<Character> set=new LinkedHashSet<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }
        System.out.println(set);


        char[] arr1=new char[set.size()];
        int index=0;
        for(char c:set){
            arr1[index]=c;
            index++;
        }
        System.out.println(arr1);


        StringBuilder sb=new StringBuilder();
        for(char c:set){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
