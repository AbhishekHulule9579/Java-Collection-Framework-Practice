package DSA.TCS_Interview;

public class T13_Find_Word_In_Sentence {
    public static boolean isFound(String str,String target){
        boolean found=false;
        String[] arr=str.split(" ");
        for(String str1:arr){
            if(str1.equals(target)){
                found=true;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        String str="tcs nqt tcs pune";
        String target="pune";
        if(isFound(str,target)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
