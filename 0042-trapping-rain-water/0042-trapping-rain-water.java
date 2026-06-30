class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int left = 0;
        int right = height.length - 1;

        int leftMaxHeight = 0;
        int rightMaxHeight = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMaxHeight){
                    leftMaxHeight = height[left];
                } else{
                    trappedWater += leftMaxHeight - height[left];
                }

                left++;
            } else{
                if(height[right] >= rightMaxHeight){
                    rightMaxHeight = height[right];
                } else{
                    trappedWater += rightMaxHeight - height[right];
                }

                right--;
            }
        }
    
        return trappedWater;
    }
}