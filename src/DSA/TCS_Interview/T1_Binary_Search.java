package DSA.TCS_Interview;

import java.sql.SQLOutput;

public class T1_Binary_Search {
    public static int binary_search(int [] arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            } else if (arr[mid]<k) {
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=2;
        System.out.println(binary_search(arr,k));
    }
}
