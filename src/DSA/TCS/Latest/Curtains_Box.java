package DSA.TCS.Latest;

import java.util.Scanner;

public class Curtains_Box {
    public static int maxAquaCurtains(String str,int n){
        int maxCount=0;
        for(int i=0;i<str.length();i+=n){
            int count=0;
            for(int j=i;j<i+n && j<str.length();j++){
                if(str.charAt(j)=='a'){
                    count++;
                }
                maxCount=Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        System.out.println(maxAquaCurtains(str,n));
    }
}
