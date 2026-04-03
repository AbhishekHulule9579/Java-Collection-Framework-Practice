package DSA.TCS_Interview;

public class T19_Swaping_Without_Third {
    public static void main(String[] args) {
        int a=4;
        int b=3;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);

        String a1="Hello";
        String b1="World";

        a1=a1+b1;
        b1=a1.substring(0,a1.length()-b1.length());
        a1=a1.substring(b1.length());

        System.out.println(a1);
        System.out.println(b1);
    }
}
