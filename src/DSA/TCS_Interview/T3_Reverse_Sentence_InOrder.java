package DSA.TCS_Interview;

public class T3_Reverse_Sentence_InOrder {
    public static void main(String[] args) {
        String str="SKN Sinhgad Institute of Technology and Science";

        String[] str1=str.split(" ");
        String result="";
        for(String str2:str1){
            String reversed="";
            for(int i=str2.length()-1;i>=0;i--){
                reversed += str2.charAt(i);
            }
            result +=reversed+" ";
        }
        System.out.println(result);
    }
}
