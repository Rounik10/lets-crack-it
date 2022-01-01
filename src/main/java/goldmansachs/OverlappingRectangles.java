package goldmansachs;

/**
 * Q: Overlapping rectangles
 * Link: https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/1/
 */
public class OverlappingRectangles {

    int doOverlap(int[] L1, int[] R1, int[] L2, int[] R2) {
        if (R1[0] < L2[0] || L1[0] > R2[0]) return 0;
        if (L1[1] < R2[1] || R1[1] > L2[1]) return 0;
        return 1;
    }
}