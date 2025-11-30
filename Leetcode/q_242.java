package Leetcode;

import java.util.Arrays;

public class q_242 {
    public boolean isAnagram(String s, String t) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String s_String = arr.toString();

        char arr1[] = t.toCharArray();
        Arrays.sort(arr1);
        String t_String = arr1.toString();

        if(s_String.equals(t_String)) {
            return true;
        }

        return false;
    }
}
