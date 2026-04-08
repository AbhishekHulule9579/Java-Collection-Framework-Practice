package DSA.TCS_Interview;

public class T27_Second_Highest_Elememt_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 8, 3},
                {9, 2, 7},
                {6, 1, 4}
        };
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int num=matrix[i][j];
                if(num>max){
                    secondmax=max;
                    max=num;
                }
                else if (num>secondmax && num!=max){
                    secondmax=num;
                }
            }
        }
        System.out.println("Second highest in the matrix is "+secondmax);
    }
}
