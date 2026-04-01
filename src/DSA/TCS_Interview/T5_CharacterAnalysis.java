package DSA.TCS_Interview;

import java.util.LinkedHashMap;
import java.util.Map;

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
        System.out.println("character: "+ch+" occures "+ max+" times");
    }
}
