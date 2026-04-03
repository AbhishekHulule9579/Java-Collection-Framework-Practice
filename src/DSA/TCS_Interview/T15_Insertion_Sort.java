package DSA.TCS_Interview;

import java.util.Arrays;

public class T15_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        int n= arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
