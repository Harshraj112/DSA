import java.util.Collections;
import java.util.TreeSet;

public class q_414 {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int n : nums) {
            set.add(n);
        }

        if (set.size() < 3) {
            return set.first(); 
        }

        set.pollFirst(); 
        set.pollFirst(); 

        return set.first(); 
    }
}
