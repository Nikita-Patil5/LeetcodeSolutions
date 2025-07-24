class Solution {
    public boolean isValid(String s) {
        
        int lengthBefore;

        do{
            lengthBefore = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");

        }while(lengthBefore != s.length());

        return s.isEmpty();
    }
}