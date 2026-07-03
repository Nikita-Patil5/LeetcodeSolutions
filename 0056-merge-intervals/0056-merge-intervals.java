class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> mergeList = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
                int nextStart = intervals[i][0];
                int nextEnd = intervals[i][1];

                if(nextStart <= currentEnd){
                    currentEnd = Math.max(currentEnd, nextEnd);
                } else {
                    mergeList.add(new int[]{currentStart, currentEnd});
                    currentStart = nextStart;
                    currentEnd = nextEnd;
                }
            }

            mergeList.add(
            new int[]{currentStart, currentEnd}
        );

        return mergeList.toArray(new int[mergeList.size()][]);
    }
}
