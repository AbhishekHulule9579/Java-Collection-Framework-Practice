package DSA.TCS_Interview;

public class T28_Smallest_In_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 8, 3},
                {9, 2, 7},
                {6, 1, 4}
        };
        int low=Integer.MAX_VALUE;
        int secondLow=Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int num=matrix[i][j];
                if(num<low){
                    secondLow=low;
                    low=num;
                }else if(num>low && num<secondLow){
                    secondLow=num;
                }
            }
        }

        System.out.println("Second lowest "+secondLow);
    }
}
