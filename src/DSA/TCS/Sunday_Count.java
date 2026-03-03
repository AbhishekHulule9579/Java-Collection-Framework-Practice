package DSA.TCS;

import java.util.Scanner;

public class Sunday_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String week[]={"mon","tue","wed","thu","fri","sat","sun"};
        for(int i=0;i< week.length;i++){
            if (week[i].equals(n))
                break;
            int res=1;
            int rem=6-i;
            n=n-rem;
            if(n>0)
                res+=n/7;
            System.out.println(res);
        }
    }
}
