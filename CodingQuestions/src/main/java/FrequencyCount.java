import java.lang.reflect.Array;
import java.util.Arrays;

public class FrequencyCount {

    public static void main(String args[]){
        String str = "I do what i Do";
        getF(str);
    }

    public static void getF(String str){

        String arr[] = str.split(" ");
        int fCounter = 0 ;

        boolean flag[] = new boolean[arr.length];
        System.out.println(arr.length);
        Arrays.fill(flag,false);

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j ++){

                if(arr[i]==arr[j]){
                    if (flag[i]=true)
                    continue;

                    if(flag[i] = false){
                        flag[i]=true;

                        fCounter++;
                    }
                    }
            }
        }


    }
}
