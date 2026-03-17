package DSA.TCS.Latest;

import java.util.Scanner;

public class Hidden_Key_Decryption {
    public static int findkey(String s,int[]encrypt){
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int enc:encrypt){
            min=Math.min(min,enc);//it takes the min in the array
            max=Math.max(max,enc);//it takes max in the array
        }
        //finding the lower bound and upperbound
        int lowerBound=max-25;
        int upperBound=min-1;

        for(int i=0;i<n;i++){
            int pos=s.charAt(i)-'A'+1; //C(68)-A(65)=2+1=3 pos  (+1 from starting from 1 not from 0)
            if(pos>=lowerBound && pos<=upperBound){
                return pos;
            }
        }
        return -1;  // for invalid input
    }

    public static String decrypt(int[] encrypt,int key){
        StringBuilder decrypt=new StringBuilder();

        for(int val:encrypt){
            int originalKey=val-key;//35-20=15 original val
            char C=(char)('A'+originalKey-1); //65+15=80-1=79 ( O )   (-1 to start from indexed 0)
            decrypt.append(C);
        }
        return decrypt.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int[] encrypt=new int[n];
        for(int i=0;i<n;i++){
            encrypt[i]=sc.nextInt();
        }
        int key=findkey(s,encrypt);
        if(key==-1){
            System.out.println("Invalid input");
            return;
        }
        String result=decrypt(encrypt,key);
        System.out.println(key);
        System.out.println(result);
    }
}
/*
 Problem Statement

You are given:
A string consisting of uppercase English letters (A–Z).
A sequence of integers representing the encrypted values of each character.
The encryption rule is:
Encrypted Value = Alphabet Position of Character + Key
Where:
A = 1, B = 2, ..., Z = 26
The Key is not given directly.
The Key is the alphabetical position of one of the characters present in the given string.
The same key is used for all characters.
Your task is to:
Determine the valid range in which the key lies.
Identify the correct key from the given string.
Decrypt the entire encrypted sequence.
Print the key and the decrypted string.
Input
AYBTCH
28 25 31 31 35 27

output
HEKKOG
 */