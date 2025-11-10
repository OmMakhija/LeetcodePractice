public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }

        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = 0; j < merged.length - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }

        if ((m + n) % 2 == 0) {
            return (merged[(m + n) / 2 - 1] + merged[(m + n) / 2]) / 2.0;
        } else {
            return merged[(m + n) / 2];
        }
    }
}
