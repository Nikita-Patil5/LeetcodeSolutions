class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] seen = new boolean[26];

        for(char ch : sentence.toCharArray()){
            int index = ch - 'a';
            seen[index] = true;
        }

        for(boolean isSeen : seen){
            if(!isSeen){
                return false;
            }
        }

        return true;
    }
}