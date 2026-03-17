package DSA.TCS.Latest;

public class Snake_Pattern {
    public static void main(String[] args) {
       int [][]matrix={
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };
       int rows=matrix.length;
       int columns=matrix[0].length;

       for(int i=0;i<rows;i++){

           //even row left to right
           if(i%2==0){
               for(int j=0;j<columns;j++){
                   System.out.print(matrix[i][j]);
               }
           }

           //odd row right to left
           else {
               for(int j=columns-1;j>=0;j--){
                   System.out.print(matrix[i][j]);
               }
           }
       }
    }
}
/*
Snake Pattern (Basic):
Given a matrix, print it in snake pattern (row-wise).
Example
123
456
789
Output:123654789
1 2 3
4 5 6
7 8 9
 */