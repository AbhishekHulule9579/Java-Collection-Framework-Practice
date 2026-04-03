package DSA.TCS_Interview;

public class T14_Leap_Year {
    public static void main(String[] args) {
        int n=2026;
        if((n%4==0 && n%100!=0) || (n %400 ==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap");
        }
    }
}
