package DSA.TCS.Latest;

public class Autmobile_Company {
    public static void main(String[] args) {
        int v=10;
        int w=28;
        if(w%2!=0 || w<2*v || w>4*v){
            System.out.println("-1");
            return;
        }
        int fourwheelers=(w-2*v)/2;
        int twowheelers=v-fourwheelers;

        System.out.println(fourwheelers+"______"+twowheelers);
    }
}
/*
An automobile company manufactures both two-wheelers (TW) and four-wheelers (FW).
A company manager wants to determine how many two-wheelers and
four-wheelers must be manufactured based on the following data:
Total number of vehicles = v
Total number of wheels = w
You need to find:
Number of Two-Wheelers (TW)
Number of Four-Wheelers (FW)
If the given data is invalid, print -1.
Input:
First line contains an integer v (total vehicles)
Second line contains an integer w (total wheels)
Output:
Print two integers:
Number of Two Wheelers
Number of Four Wheelers
  Input =
  10
  28
  output=  6 4
 */