import java.util.Scanner;

public class SumOfFirstNPrimeNumbers {
    //Driver method
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scan.nextInt();

        System.out.println("Sum: " + sumOfPrimes(num));
    }

    public static int sumOfPrimes(int lim) {
        int sum = 0;
        for (int i = 2; i < lim; i++) {
            int res = isPrime(i);
            sum += res;
            if (res != 0) {
                System.out.println(res);
            }
        }
        return sum;
    }

    public static int isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return 0;
            }
        }
        return i;
    }

}
