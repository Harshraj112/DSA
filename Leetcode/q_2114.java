public class q_2114 {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i=0; i<sentences.length; i++) {
            String currSent = sentences[i]; 
            String[] words = currSent.trim().split("\\s+");

            int count = words.length;

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
