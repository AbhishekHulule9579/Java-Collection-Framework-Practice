package DSA.Others_Company;

public class O3_Leap_Year {
    public static boolean isLeapYear(int n){
        if(n %400==0)return true;
        if(n %100==0)return false;
        if(n%4==0)return true;
        return false;
    }

    public static void main(String[] args) {
        int year=2026;
        if(isLeapYear(year)){
            System.out.println("it is leap year "+year);
        }
        else{
            System.out.println("it is not leap year");
        }
    }
}
