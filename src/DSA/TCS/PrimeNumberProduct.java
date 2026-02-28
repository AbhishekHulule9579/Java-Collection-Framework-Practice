package DSA.TCS;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberProduct {
    public static List<Integer> generatePrime(int limit){
        boolean isPrime[]=new boolean[limit+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=limit;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=limit;j+=i){
                    isPrime[j]=false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();

        int maxPosition=Math.max(x,y);
        int limit=(int)(maxPosition *(Math.log(maxPosition)+Math.log(Math.log(maxPosition))))+10;
        List<Integer>primes=generatePrime(limit);
        int xPrime= primes.get(x-1);
        int yPrime=primes.get(y-1);
        int result=(xPrime * yPrime)-1;
        System.out.println("The Prime number product is "+result);
    }
}
/*
Write a program that accepts two integer inputs, X and Y, which denote
specific positions in the sequence of prime numbers. The program should
identify the prime numbers at these positions, compute their product,
subtract 1 from the result, and display the final output.
TestCases:
3 5
Output
Explaination:
3rd prime number → 5
5th prime number → 11
Output (5*11)-1=54
*/
