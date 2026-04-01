package DSA.TCS_Interview;

public class T7_LargestGoodInteger {
    public static void main(String[] args) {
        String num="1112223344999888";
        String result="";
        for(int i=0;i<=num.length()-3;i++){
            char a=num.charAt(i);
            char b=num.charAt(i+1);
            char c=num.charAt(i+2);

            if(a==b && b==c){
                String current=""+a+b+c;

                if(result.equals("") || current.compareTo(result)>0){
                    result=current;
                }
            }
        }
        System.out.println(result);
    }
}
