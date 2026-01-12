import java.util.*;

public class q_125 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder a = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)) {
                a.append(ch);
            }
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("This given line is " + isPalindrome(s));
        sc.close();
    }
}
