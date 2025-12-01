package codeforces;

import java.util.Scanner;

public class q_2166_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            char last = s.charAt(n - 1); 
            int count = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == last) {
                    count++;
                } else {
                    break;
                }
            }

            int operations = n - count;

            System.out.println(operations);
        }
        
        sc.close();
    }
}
