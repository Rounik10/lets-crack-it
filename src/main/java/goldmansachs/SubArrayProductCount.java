package goldmansachs;

/**
 * Q: Count number of sub arrays having product less than 'k'
 * Link: https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#
 */
public class SubArrayProductCount {

    public int countSubArrayProductLessThanK(long[] arr, long n, long k) {
        int sum = 0, prod = 1;
        int start = 0;

        for (int end = 0; end < n; end++) {
            prod *= arr[end];

            while (prod >= k && start < n) {
                prod /= arr[start];
                start++;
            }

            if (prod < k) sum += (end - start + 1);
        }

        return sum;
    }

}