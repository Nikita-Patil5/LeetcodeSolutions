class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> seen = new HashMap<>();

       for(int i = 0; i < nums.length; i++){
        int result = target - nums[i];

        if(seen.containsKey(result)){
            return new int []{seen.get(result), i};
        }

        seen.put(nums[i], i);
       }
      
     return new int[]{};
}
}