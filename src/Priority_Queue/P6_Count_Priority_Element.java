package Priority_Queue;

import java.util.PriorityQueue;

public class P6_Count_Priority_Element {
    public static void main(String[] args) {
        PriorityQueue<String>pq=new PriorityQueue<String>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("White");
        System.out.println(pq);
        System.out.println(pq.size());
    }
}
