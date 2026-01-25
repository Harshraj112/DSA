public class q_13 {
    public int romanToInt(String s) {
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            
            int next = 0;
            if (i + 1 < s.length()) {
                next = getValue(s.charAt(i + 1));
            }
            
            if (current < next) {
                sum = sum - current;
            }
            else {
                sum = sum + current;
            }
        }
        
        return sum;
    }
 
    private int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
