class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int pointer = num.length - 1;
        int carry = 0;

        while(pointer >= 0 || k > 0){
            int numval = 0;

            if(pointer >= 0){
                numval = num[pointer];
            }

            int lastDigit = k % 10;
            int sum = numval + lastDigit + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ans.add(digit);
            pointer--;
            k = k / 10;
        }
        if(carry > 0){
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
    }
}