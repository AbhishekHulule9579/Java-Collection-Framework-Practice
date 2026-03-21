package DSA.TCS.Latest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Transaction_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<String>set=new HashSet<>();
        int prevTime=-1;
        for(int i=0;i<n;i++){
            String sender=sc.next();
            String receiver=sc.next();
            int time=sc.nextInt();
            int amount=sc.nextInt();
            String key=sender+"-"+receiver;
            if(set.contains(key)){
                System.out.println("Error:Duplicate Transaction");
                return;
            }
            set.add(key);
            if(prevTime!=-1 && Math.abs(time-prevTime)>60){
                System.out.println("Fraud Detected");
                return;
            }
            prevTime=time;

        }
        System.out.println("All transaction are verified");
    }
}
/*
Problem Statement
You are building a Transaction Monitoring
System for a financial platform.
The system processes N transactions. Each
transaction contains the following 4
parameters:
• sender (string)
• receiver (string)
• timestamp (integer, in seconds)
• amount (integer)
Rules
1. Duplicate Transaction Check
If any transaction has the same sender
AND receiver as a previous transaction,
print:
Error: Duplicate Transaction
and terminate the program.
2. Fraud Detection Rule
If the difference between timestamps of
any two consecutive transactions is
greater than 60 seconds, print:
Fraud Detected
and terminate the program.
3. If all transactions are valid, print:
All Transactions Valid
Input Format
• First line: Integer N (number of
transactions)
• Next N lines:
Each line contains:
sender receiver timestamp amount
Output Format
• Print one of the following:
o "Error: Duplicate Transaction"
o "Fraud Detected"
o "All Transactions Valid"
Constraints
• 1 ≤ N ≤ 10^5
• timestamp ≥ 0
• amount ≥ 0
Sample Test Cases
Test Case 1 (Valid Transactions)
Input:
3
A B 10 100
C D 50 200
E F 100 300
Output:
All Transactions Valid
Test Case 2 (Duplicate Sender-Receiver)
Input:
3
A B 10 100
C D 50 200
A B 70 300
Output:
Error: Duplicate Transaction
Test Case 3 (Fraud Detection)
Input:
3
A B 10 100
C D 50 200
E F 200 300
Output:
Fraud Detected
 */