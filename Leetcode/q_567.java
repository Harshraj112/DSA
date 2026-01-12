public class q_567 {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        // If s1 is longer than s2, impossible
        if (n1 > n2) return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // Build frequency for s1 and first window of s2
        for (int i = 0; i < n1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        
        // Helper to compare frequency arrays
        if (matches(freq1, freq2)) return true;
        
        // Slide the window over s2
        for (int i = n1; i < n2; i++) {
            // Add new char (right side of window)
            freq2[s2.charAt(i) - 'a']++;
            // Remove old char (left side of previous window)
            freq2[s2.charAt(i - n1) - 'a']--;
            
            if (matches(freq1, freq2)) return true;
        }
        
        return false;
    }
    
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}


