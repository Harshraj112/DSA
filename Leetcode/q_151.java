public class q_151 {
    public String reverseEachWord(String s) {
        String[] words = s.split(" ");
        StringBuilder newStr = new StringBuilder();

        for (String word : words) {
            newStr.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        return newStr.toString().trim();
    }

}