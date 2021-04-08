import java.util.ArrayList;

public class ReversingWordsInASentence {
    public static void main(String args[]){
        System.out.println(revOrder("my name is amit"));
    }
    public static String revOrder(String str){
        String resStr = "";
        String arr[] = str.split(" ");

        int length = arr.length;
        while(length-- >0){
            resStr += " "+strReverse(arr[length]);
        }
        return resStr ;
    }

    public static String strReverse(String str){
        String res = "" ;
        char arr[] = str.toCharArray();
        int len = arr.length;
        while(len-- > 0 ){
            res = res+arr[len];
        }
        return res;
    }
}