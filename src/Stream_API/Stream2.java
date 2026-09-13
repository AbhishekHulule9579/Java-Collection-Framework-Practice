package Stream_API;

import java.util.ArrayList;

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Integer>marks=new ArrayList<Integer>();
        marks.add(25);
        marks.add(35);
        marks.add(40);
        marks.add(30);
        marks.add(45);

        System.out.println(marks);
        long noOfFailedStudent=marks.stream().filter(i->i<35).count();
        System.out.println(noOfFailedStudent);
    }
}
