package DSA.TCS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterAnalysis {
    public static void analyzeString(String str){
        str=str.toLowerCase().replaceAll("\\s","");
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String firstNonRepeat="None";
        for(char c:str.toCharArray()){
            if(map.get(c)==1){
                firstNonRepeat=String.valueOf(c);
                break;
            }
        }
        char mostFrequent=str.charAt(0);
        int maxfreq=1;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()>maxfreq){
                maxfreq=entry.getValue();
                mostFrequent=entry.getKey();
            }
        }
        if(maxfreq==1){
            mostFrequent=str.charAt(0);
        }
        System.out.println(firstNonRepeat+" "+Character.toUpperCase(mostFrequent));


    }
    public static void main(String[] args) {
        analyzeString("Swadesh");
        analyzeString("aabbcc");
    }
}
