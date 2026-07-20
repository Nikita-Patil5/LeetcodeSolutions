class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()){
            return result;
        }

        int[] freqP = new int[26];
        int[] windowFreq = new int[26];
        int left = 0;

        for(int right = 0; right < p.length(); right++){
            freqP[p.charAt(right) - 'a']++;
            windowFreq[s.charAt(right) - 'a']++;
        }

        for(int right = p.length(); right < s.length(); right++){
            if(Arrays.equals(freqP, windowFreq)){
                result.add(left);
            }

            windowFreq[s.charAt(left) - 'a']--;
            windowFreq[s.charAt(right) - 'a']++;
            left++;
        }

        if(Arrays.equals(freqP, windowFreq)){
            result.add(left);
        }

        return result;
    }
}