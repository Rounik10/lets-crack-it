package goldmansachs;


/**
 * Q. Ugly numbers are numbers whose only prime factors are 2, 3 or 5
 * Write a program to get the n'th ugly number.
 *
 * Link: https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/
 */
public class UglyNumber {

    private long getUglyNumber(int n) {
        long[] dp = new long[n + 1];
        dp[1] = 1;
        int pt2 = 1, pt3 = 1, pt5 = 1;

        for (int i = 2; i <= n; i++) {
            long v2 = dp[pt2] * 2;
            long v3 = dp[pt3] * 3;
            long v5 = dp[pt5] * 5;

            long min = Math.min(Math.min(v2, v3), v5);
            dp[i] = min;

            if (min == v2) pt2++;
            if (min == v3) pt3++;
            if (min == v5) pt5++;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        var ans = new UglyNumber().getUglyNumber(20);
        System.out.println(ans);
    }
}