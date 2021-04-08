import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string input: ") ;
        String str = scan.next();

        System.out.println("is String Palindrome: " + isPalindrom(str));
    }

    public static boolean isPalindrom(String str) {
        if (str.equalsIgnoreCase(revString(str))) {
            return true;
        }
        return false;
    }

    public static String revString(String str) {
        String resStr = "";
        char arr[] = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            resStr += arr[i];
        }
        System.out.println("Reverse order of the string is: " + resStr);
        return resStr;
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}
