import java.util.Arrays;

public class q_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String s_String = new String(arr);

        char arr1[] = t.toCharArray();
        Arrays.sort(arr1);
        String t_String = new String(arr1);

        return s_String.equals(t_String);
    }
}
