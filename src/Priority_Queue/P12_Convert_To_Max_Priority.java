package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class P12_Convert_To_Max_Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq1=new PriorityQueue<>(10, Collections.reverseOrder());
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println("The original queue is "+pq1);

        System.out.print("Maximum priority queue: ");
        Integer val=null;
        while((val=pq1.poll())!=null){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
