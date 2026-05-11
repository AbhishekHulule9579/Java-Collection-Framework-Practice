package Priority_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class P10_Convert_Priority_To_Array {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq1=new PriorityQueue<>();
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);

        System.out.println("The original priority queue is "+pq1);
        List<Integer>array_list=new ArrayList<Integer>(pq1);
        System.out.println("Arraylist containg priority queue "+array_list);
    }
}
