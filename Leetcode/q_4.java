import java.util.Arrays;

public class q_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);

        Arrays.sort(result);
        int n = result.length;
        double median;

        if(n % 2 == 1) {
            median = result[n / 2];
        } else {
            median = (result[n/2 - 1] + result[n/2]) / 2.0;
        }

        return median;
    }
}
