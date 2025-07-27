class Solution {
    public int majorityElement(int[] nums) {
         int candidate = 0; // Can be initialized to any value
        int count = 0;

        for (int num : nums) {
            // If count is 0, we choose a new candidate
            if (count == 0) {
                candidate = num;
            }

            // If the current number is our candidate, we increment the count.
            // Otherwise, we decrement it.
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        // Because the problem guarantees a majority element exists,
        // the final candidate is our answer. No second pass is needed.
        return candidate;
    }}
