package DSA.IBM;

public class I6_MinimumInsertionABC {
    public static int minInsertion(String str){
        
        int insertion=0;
        char expected='a';

        for(int i=0;i<str.length();){
            if(str.charAt(i)==expected){
                i++;
                expected=(expected=='a')?'b':(expected=='b')?'c':'a';
            }
            else {
                insertion++;
                expected=(expected=='a')?'b':(expected=='b')?'c':'a';
            }
        }
        while (expected!='a'){
            insertion++;
            expected=(expected=='a')?'b':(expected=='b')?'c':'a';
        }
        return insertion;
    }
    public static void main(String[] args) {
        String str="abcaac";
        System.out.println("THe minimum insertion required is "+minInsertion(str));
    }
}
/*
 Given a string made up of 'a', 'b', and 'c',
 determine the minimum insertions required so that it becomes a valid repeating "abc" sequence.

 input --> abcaac
 output --> 2
 */
