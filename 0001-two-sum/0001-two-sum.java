class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                int result = nums[i] + nums[j];
                if(result == target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}