package DSA.Others_Company;

public class O1_Nearest_Prime_Number {
    public static boolean isPrime(int num){
        if(num<=1)return false;
        if(num==2)return true;
        if(num %2==0) return false;

        for(int i=3;i*i<=num;i+=2){
            if(num%i==0)return false;
        }
        return true;
    }

    public static int nearest(int n){
        if(n<=2) return 2;
        int lower=n,higher=n;
        while(true){
            if(lower>=2 && isPrime(lower))
                return lower;
            if(isPrime(higher))
                return higher;
        }
    }

    public static void main(String[] args) {
        int n=20;
        System.out.println("The nearest prime number is "+nearest(n));
    }
}
