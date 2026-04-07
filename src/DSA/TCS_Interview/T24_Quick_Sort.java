package DSA.TCS_Interview;

public class T24_Quick_Sort {
    public static void quicksort(int[] arr,int low,int high){
        if(low>high){
            int pivotindex=partition(arr,low,high);
            quicksort(arr,low,pivotindex-1);
            quicksort(arr,pivotindex+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
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
