public class q_268 {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int counter = 0;
        // int index = 0;

        // for(int i = 0; i < n + 1; i++){
            
        //     counter = 0;

        //     for(int j = 0; j < n; j++){
        //         if(i != nums[j]){
        //             counter++;
        //             index = i;
        //         }
        //     }

        //     if (counter == n){
        //         break;
        //     }
        // }

        // return index;

        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int numsSum = 0;
        for(int i = 0; i < n; i++){
            numsSum += nums[i];
        }

        return sum - numsSum;

    //     public int missingNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     if(nums[0] == 0) {
    //         for(int i=0; i<nums.length-1; i++) {
    //             if(nums[i] + 1 != nums[i+1]) {
    //                 return i+1;
    //             }
    //         }
    //     } else {
    //         return 0;
    //     }

    //     if(nums.length == 1 && nums[0] == 1) {
    //         return 0;
    //     }

    //     return nums.length;
    // }
    }
}
