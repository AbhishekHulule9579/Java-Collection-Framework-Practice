package DSA.TCS_Interview;

public class T6_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
        System.out.println("Sorted array");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
