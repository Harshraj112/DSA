package Codechef;

public class discount {
    public String checkCoupon(int n, int x, int y, int[] prices) {

        int sumOriginal = 0;
        int sumDiscounted = 0;

        for (int i = 0; i < n; i++) {
            sumOriginal += prices[i];

            int discounted = prices[i] - y;
            if (discounted > 0) {
                sumDiscounted += discounted;
            }
        }

        int totalWithCoupon = x + sumDiscounted;

        if (totalWithCoupon < sumOriginal) {
            return "COUPON";
        } else {
            return "NO COUPON";
        }
    }
}

