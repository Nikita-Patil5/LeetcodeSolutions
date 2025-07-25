class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityCount = n / 2;

        for(int i = 0; i < n; i++){
            int element = nums[i];
            int count = 0;
            for(int j = 0; j < n; j++){
                if(element == nums[j]){
                    count++;
                }
            }
            if(count > majorityCount){
            return element;
            }
        }

        return -1;
    }
}