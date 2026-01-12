package codeforces;

import java.util.*;
 
public class q_2166_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();

            long moves = 0;

            // Your logic: in each iteration, if b * n > a, one movement happens
            while (b * n > a) {
                moves++;
                n--;  // one tab closed
            }

            // After loop ends (b * n <= a), add 1 for base movement
            moves++;

            System.out.println(moves);
        }
        sc.close();
    }
}

