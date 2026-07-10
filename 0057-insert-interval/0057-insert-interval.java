class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if(currentEnd < newInterval[0]) {

                result.add(intervals[i]);

            } else if(currentStart > newInterval[1]) {

                result.add(newInterval);

                newInterval = intervals[i];

            } else {

                newInterval[0] =
                    Math.min(newInterval[0], currentStart);

                newInterval[1] =
                    Math.max(newInterval[1], currentEnd);
            }
        }

        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}