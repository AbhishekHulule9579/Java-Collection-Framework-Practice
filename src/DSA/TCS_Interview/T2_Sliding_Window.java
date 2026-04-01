package DSA.TCS_Interview;

import java.util.LinkedList;

public class T2_Sliding_Window {
    public static void maximiumsliding(int [] arr,int k){
       // LinkedList<Integer>list=new LinkedList<>();
        for(int i=0;i<= arr.length-k;i++){
            int max=arr[i];
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                   max=arr[j];
                }
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        maximiumsliding(arr,k);
    }
}
