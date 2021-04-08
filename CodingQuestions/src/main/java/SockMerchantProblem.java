import java.io.*;
import java.util.*;

public class SockMerchantProblem {

    private static final Scanner scanner = new Scanner(System.in);

    static int sockMerchant(int n, int[] arr) {
        int length = n ;
        int socksCount = 0;

        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {
            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            socksCount+=count/2;
        }

        return socksCount;
    }

    public static void main(String[] args) throws IOException {
        int arr[] = {1,2,2,3,5,5,5,5,0,0};
        int res = sockMerchant(arr.length,arr);

        System.out.println(res);
    }
}
