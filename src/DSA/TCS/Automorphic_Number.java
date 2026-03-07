package DSA.TCS;
import java.util.Scanner;

public class Automorphic_Number {
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;
        while(temp > 0) {
            if(temp % 10 != square % 10)
                return false;
            temp /= 10;
            square /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isAutomorphic(n))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}

/*
 A number is called an Automorphic number if and only if
 * its square ends in the same digits as the number itself.
 */