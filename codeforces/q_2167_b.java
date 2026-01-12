package codeforces;

import java.util.*;

public class q_2167_b {
    public static String find(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String s_sort = new String(arr);

        char[] arr1 = t.toCharArray();
        Arrays.sort(arr1);
        String t_sort = new String(arr1);

        if (!s_sort.equals(t_sort)) {
            return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(find(s, t));
        sc.close();
    }
}
