package DSA.TCS.Actual_2026_Question;

public class Q2_20_March_Shift_1_Que_2 {
    public static void main(String[] args) {

    }
}
/*
TCS 20 march shift 1 (morning) coding question 2(hard)
2. Find duplicate or fraud transactions
Given transactions in the following format
Sender receiver amount timestamp as a single string
A transaction is fraud if it already exists if it  and time difference is less than 60 seconds
If you found fraud transaction print it
I used map
Sender receiver amount is key
Timestamp is value
examle 1:
input :
2
A B 100 500
A B 110 600
Output
error duplication transaction

example 2:
Input
2
A B 100 500
C D 200 300
Output
fraud detected
 */