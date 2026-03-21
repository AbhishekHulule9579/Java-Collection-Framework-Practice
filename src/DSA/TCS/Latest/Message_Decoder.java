package DSA.TCS.Latest;

import java.util.Scanner;

public class Message_Decoder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();

        String result="";
        int num=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             if(Character.isDigit(ch)){
                 num=ch-'0';
             }
             else{
                 if(num==0)
                     result +=ch;
                 else{
                     for(int j=0;j<num;j++){
                         result+=ch;
                     }
                 }
                 num=0;
             }
        }
        System.out.println(result);
    }
}
/*
input==
a3b2c1
output==
abbbcc
 */