package DSA.Others_Company;

public class O2_Second_Largest {
    public static int findSecondLargest(int[] arr){
        if(arr==null || arr.length<2)return -1;
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }
            else if(num>second && num!=first){
                second=num;
            }
        }
        return (second == Integer.MIN_VALUE)?-1:second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 5, 8};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
/*
 Given an array of numbers, find the second largest number, considering that there may be duplicate numbers.
 */