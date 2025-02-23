class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int n = chars.length;
        int i = 0;

        while(i < n){
            char currentChar = chars[i];
            int count = 0;

            while(i < n && chars[i] == currentChar){
                count++;
                i++;
            }

            chars[index] = currentChar;
            index++;

            if(count > 1){
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }

        }   

        return index;
    }
}