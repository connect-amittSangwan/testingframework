import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Chapter_4_LambdaExpressionsContinued {
    /*
    Collections.sort(l, Comparator object);

    Comparator Interface
    int compare(Object obj1 , Object obj2)
    return -ve iff obj1 has to be come before obj2
    return +ve iff obj1 has to come after obj2
    return 0 iff obj1 and obj2 are equal

    Class example implements Comparator<Integer>{
    // Old style
    public int compare(Integer I1, Integer I2)
    {
    if(I1>I2)
    return 1 ;

    else if(I1<I2)
    return -1;

    else
    return 0;
    }
    }
     */

    public static void main(String arg[]){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(15);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
/*

        Comparator<Integer> comparator = (a ,b) -> {
            if(a >b)
                return -1;
            else  if(a < b)
                return 1;
            else
                return 0;
        };
*/

        // Reverse order sortig
        Comparator<Integer> comparator = (a,b) -> (a>b)?-1 : (a<b)?1 :0 ;
        Collections.sort(arrayList,comparator);
        System.out.println(arrayList);

        //Even first
        comparator = (a,b) -> (a%2==0)?-1 : (a%2!=0)?1 :0 ;
        Collections.sort(arrayList,comparator);
        System.out.println(arrayList);


    }
}
