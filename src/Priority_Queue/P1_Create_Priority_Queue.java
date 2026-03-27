package Priority_Queue;

import java.util.PriorityQueue;

public class P1_Create_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<String>queue=new PriorityQueue<String>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("The original priority queue");
        System.out.println(queue);
    }
}
