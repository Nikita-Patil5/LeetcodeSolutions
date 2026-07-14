class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int hashLen = 256;
        int[] hash =new int[hashLen];

        Arrays.fill(hash, -1);

        while(right < n){
            if(hash[s.charAt(right)] >= left){
                left = Math.max(hash[s.charAt(right)] + 1, left);
            }

            int len = right - left + 1;
            maxLength = Math.max(len, maxLength);

            hash[s.charAt(right)] = right;

            right++;
        }

        

        return maxLength;
    }
}