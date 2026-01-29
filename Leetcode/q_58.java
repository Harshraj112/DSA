public class q_58 {

    public int lengthOfLastWord(String s) {
        s = s.trim();                
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}