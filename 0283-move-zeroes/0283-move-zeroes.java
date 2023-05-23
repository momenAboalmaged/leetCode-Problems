class Solution {
    public void moveZeroes(int[] nums) {
        
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            // if (nums.length < 1) {
            //     break;
            // }
            if (nums[i]!= 0) {
                if (i != j) {
                    // swap
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;

                }
                j++;

            }

        }
      
    }
}