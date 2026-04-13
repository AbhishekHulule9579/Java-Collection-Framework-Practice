package Priority_Queue;

import java.util.PriorityQueue;

public class P4_Insert_Into_Priority {
    public static void main(String[] args) {
        PriorityQueue<String>pq=new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("White");
        System.out.println(pq);

        pq.offer("Blue");
        System.out.println(pq);
    }
}
