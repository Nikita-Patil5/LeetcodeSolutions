class Solution {
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;

        int element = 0, count = 0;
        for(int num : nums){
            if(count == 0){
                count = 1;
                element = num;
            } else if(element == num){
                    count++;
            } else{
                    count--;
            }
    
        }

        int eleCount = 0;
        for(int num : nums){
            if(num == element){
                eleCount++;
            }
        }

        if(eleCount > majorityCount){
            return element;
        }

        return -1;
    }
}