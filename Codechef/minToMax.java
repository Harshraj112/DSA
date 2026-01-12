package Codechef;

import java.util.*;

public class minToMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int M = Integer.MAX_VALUE;

            // Find minimum
            for (int num : A) {
                M = Math.min(M, num);
            }

            int ops = 0;

            // Count elements > M
            for (int num : A) {
                if (num > M) {
                    ops++;
                }
            }

            System.out.println(ops);
        }
        sc.close();
    }
}

