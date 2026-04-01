package DSA.TCS_Interview;

public class T8_Prime_Check {
    public static void main(String[] args) {
        int n=3;
        if(n<=1){
            System.out.println("Not prime ");
        }
        boolean isPrime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime ");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
