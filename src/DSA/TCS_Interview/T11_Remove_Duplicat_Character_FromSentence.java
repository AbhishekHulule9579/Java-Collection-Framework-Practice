package DSA.TCS_Interview;

public class T11_Remove_Duplicat_Character_FromSentence {
    public static void main(String[] args) {
        String str="Hello world Hello and and or";
        boolean seen[]=new boolean[256];
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch==' '){
                sb.append(ch);
            }else if (!seen[ch]){
                seen[ch]=true;
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
