import java.util.Arrays;

public class q_1491 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int count = salary.length - 2;
        int salaries = 0;
        for(int i=1; i<salary.length-1; i++) {
            salaries += salary[i];
        }

        return (double)salaries/count;
    }
}
