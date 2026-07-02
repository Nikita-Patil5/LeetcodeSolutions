class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n = nums.length;
       Map<Integer, Integer> map = new HashMap<>();
       PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(), b.getValue()));

       for(int num : nums){
         int newCount = map.getOrDefault(num, 0) + 1;
         map.put(num, newCount);
       }

       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        minHeap.offer(entry);

        if(minHeap.size() > k){
            minHeap.poll();
        }
       }

       int[] result = new int[k];
       for(int i = k -1 ; i >= 0; i--){
            result[i] = minHeap.poll().getKey();
       }

       return result;
    }
}