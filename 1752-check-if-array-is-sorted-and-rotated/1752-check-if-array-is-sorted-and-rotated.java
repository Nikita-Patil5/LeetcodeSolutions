class Solution {
    public boolean check(int[] nums) {
         
        if (nums == null || nums.length <= 1) {
            return true;
        }

        int n = nums.length;
        int breakCount = 0; 

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breakCount++;
            }
        }

        return breakCount <= 1;
    }
}