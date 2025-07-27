class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        int maxAllowed = candyType.length / 2;
        
        for(int type : candyType){
            types.add(type);
        }

        return Math.min(types.size(), maxAllowed);
    }
}