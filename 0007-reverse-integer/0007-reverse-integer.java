class Solution {
    public int reverse(int x) {
        int revNum = 0;
        while(x != 0){
            int lastDigit = x % 10;
            revNum = revNum * 10 + lastDigit;
            x = x / 10;
        }

        return revNum;
    }
}