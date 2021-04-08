import java.lang.reflect.Array;
import java.util.HashSet;

public class RemoveDuplicatesFromAnArray {
    public static void main(String args[]){

        int arr[] = {1,2,2,2,3,4,33,33};
        HashSet hs = new HashSet();

        int len = arr.length;
        while(len-- >0){
        hs.add(arr[len]);
        }
        System.out.println(hs);



    }
}
