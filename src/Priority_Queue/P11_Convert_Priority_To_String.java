package Priority_Queue;

import java.util.PriorityQueue;

public class P11_Convert_Priority_To_String {
    public static void main(String[] args) {
        PriorityQueue<String>pq1=new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Blue");
        pq1.add("Yellow");
        pq1.add("Orange");
        pq1.add("Black");

        System.out.println("the original priority queue is "+pq1);
        String str;
        str=pq1.toString();
        System.out.println("The priority conversion into the string is "+str);
    }
}
