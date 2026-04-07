package DSA.TCS_Interview;

public class T24_Quick_Sort {
    public static void quicksort(int[] arr,int low,int high){
        if(low>high){
            int pivotindex=partition(arr,low,high);

        }
    }

    public static void main(String[] args) {
        int arr[]={5,2,7,9,1,3};
        quicksort(arr,0,arr.length-1);
        System.out.println("Quick sort ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
