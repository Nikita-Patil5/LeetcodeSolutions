class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        int n = x;
        int reverseNum = 0;

        while(n > 0)
        {
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            n = n / 10;
        }

        if(reverseNum == x)
        {
            return true;
        } else{
            return false;
        }
    }
}