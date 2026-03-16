package DSA.TCS.Latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warehouse_Inventory {
    public static List<Integer>rearrange(List<Integer>arr){
        List<Integer>result=new ArrayList<>();
        List<Integer>multiple=new ArrayList<>();

        for(int num:arr){
            if(num%10==0){
                multiple.add(num);
            }
            else{
                result.add(num);
            }
        }
        result.addAll(multiple);
        return result;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,12,5,40,30,7,5,9,10);

        System.out.println(rearrange(arr));
    }
}
/*

Consider that you are managing an inventory system in a warehouse.
 Some products are packaged in bulk quantities of 10,
 and these products need to be sent to a different warehouse.
Your task is to rearrange the inventory list such that all products
whose quantities are multiples of 10 are moved to the end, while ensuring that the order
of the remaining products is not disturbed.
Problem Statement
You are given an array of integers representing product quantities.
Rearrange the array so that all multiples of 10 appear at the end of the array,
while keeping the relative order of all other elements unchanged.
Input:
arr = [10, 12, 5, 40, 30, 7, 5, 9, 10]
Output:
[12, 5, 7, 5, 9, 10, 40, 30, 10]
 */
