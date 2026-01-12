public class q_2965 {
    public int[] findAB(int [][] grid) {
        int n = grid.length;
        int total = n * n;
        int[] count = new int[total + 1];
        int a = -1, b = -1;

        for(int[] row : grid) {
            for(int num : row) {
                count[num]++;
            }
        }
        
        for(int i = 1; i <= total; i++) {
            if(count[i] == 0) {
                a = i;
            }
            if(count[i] == 2) {
                b = i;
            }
        }
        
        return new int[]{a, b};
    }
    
    public static void main(String[] args) {
        
    }
}
