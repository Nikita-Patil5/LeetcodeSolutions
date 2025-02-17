class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new LinkedList<>(); 
        int pointer = num.length - 1;

        while (pointer >= 0 || k > 0) {
            if (pointer >= 0) {
                k += num[pointer]; 
                pointer--;
            }
            
            ans.add(0, k % 10); 
            k /= 10; 
        }

        return ans;
    }
}
