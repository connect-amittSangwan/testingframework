import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(getRevString(str));
    }

    public static String getRevString(String s ){
        String resString = "";
        char arr[] = s.toCharArray();
        int arrSize = arr.length;
        for(int i = arrSize-1 ; i>=0; i--){
            if(arr[i]=='a'){
                resString = resString+"@";
                continue;
            }
            resString = resString+arr[i];
        }
        return resString;
    }
}
