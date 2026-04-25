class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int [] counts = new int[26];

        for(int i = 0; i < s.length(); i++){
            counts[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            counts[t.charAt(i) - 'a']--;
        }

        for(int count : counts){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }

//         Map<Character, Integer> map = new HashMap<>();

//         for (char c : s.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         for (char c : t.toCharArray()) {
//             if (!map.containsKey(c)) {
//                 return false;
//             }

//             map.put(c, map.get(c) - 1);

//             if (map.get(c) == 0) {
//                 map.remove(c); 
//             }
//         }

//         return map.isEmpty();
//     }
// }
