import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]){
        int a = 0;
        int b = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the series: ");

        int count = scan.nextInt();

        while(b < 100) {
            b = giveFibNum(a, b);
            a = b - a;
        System.out.println( a);
        }
    }

    public static int giveFibNum(int a , int b){
        return a+b;
    }
}
