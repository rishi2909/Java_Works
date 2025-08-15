import java.util.*;

public class Main {
    // User function Template for Java
    static class Solution {
        static int firstElement(int n) {
            // Base cases
            if (n == 1 || n == 2) return 1;

            int MOD = 1000000007;
            int a = 1, b = 1;

            // Iteratively calculate nth Fibonacci-like value
            for (int i = 3; i <= n; i++) {
                int c = (a + b) % MOD;
                a = b;
                b = c;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example inputs
        int n = sc.nextInt();
        System.out.println(Solution.firstElement(n));

        sc.close();
    }
}
