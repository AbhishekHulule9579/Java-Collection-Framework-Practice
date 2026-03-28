package Priority_Queue;

import java.util.PriorityQueue;

public class P2_Iterate_Priority {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        for(String ele:pq){
            System.out.println(ele);
        }
    }
}
