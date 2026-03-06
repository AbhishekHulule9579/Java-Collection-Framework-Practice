package DSA.TCS;

import java.util.Scanner;

public class Binary_Representation {
    public static int toggleBits(int num){
        String binary="";
        //converting decimal into the binary
        int temp=num;
        while(temp>0){
            binary=(temp%2)+binary;
            temp=temp/2;
        }
        //converting the toggled 0101 -->1010  converting 1 to 0 and 0 to 1
        String toggled="";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0')
                toggled+=1;
            else
                toggled+=0;
        }
        System.out.println(binary);
        System.out.println(toggled);
        //convert the toggled binary into the decimal
        int result=0;
        int power=0;
        for (int i=toggled.length()-1;i>=0;i--){
            if(toggled.charAt(i)=='1'){
                result+=Math.pow(2,power);
            }
            power++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(toggleBits(num));
    }
}
/*
 Joseph is learning digital logic subject which will be for his next semester.
 * He usually tries to solve unit assignment problems before the lecture.
 * Today he got one tricky question. The problem statement is “A positive integer has been
 * given as an input. Convert decimal value to binary representation.
 * Toggle all bits of it after the most significant bit including the most significant bit.
 * Print the positive integer value after toggling all bits”.
 */