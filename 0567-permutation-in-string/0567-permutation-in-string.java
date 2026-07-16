class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];
        int left = 0;

        for(int right = 0; right < s1.length(); right++){
            s1Freq[s1.charAt(right) - 'a']++;
            windowFreq[s2.charAt(right) - 'a']++;
        } 

        for(int right = s1.length(); right < s2.length(); right++){
            if(Arrays.equals(s1Freq, windowFreq)){
                return true;
            }

            windowFreq[s2.charAt(left) - 'a']--;
            windowFreq[s2.charAt(right) - 'a']++;
            left++;
        }

        return Arrays.equals(s1Freq, windowFreq);
    }
}