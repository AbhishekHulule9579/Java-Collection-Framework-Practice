package Priority_Queue;

import java.util.PriorityQueue;

public class P5_Clear_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<String>pq=new PriorityQueue<String>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("White");

        System.out.println(pq);
        pq.clear(); //used for the clearing the priority queue
        System.out.println(pq);
    }
}
