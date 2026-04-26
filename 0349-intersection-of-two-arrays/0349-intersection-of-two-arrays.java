//1.Brute Force
// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Set<Integer> seen = new HashSet<>();
//         int [] res;

//         for(int i = 0; i < nums1.length; i++){
//             for(int j = 0; j < nums2.length; j++){
//                 if(nums1[i] == nums2[j]){
//                     seen.add(nums1[i]);
//                     }
//                 }
//         }

//         int [] result = new int[seen.size()];
//         int index = 0;
//         for(int num : seen){
//             result[index++] = num;
//         }
    
//         return result;
//     }
// }

//2.Optimal Appraoch

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int num : nums1){
            seen.add(num);
        }

        for(int num : nums2){
            if(seen.contains(num)){
                resultSet.add(num);
            }
        }

        int [] result = new int[resultSet.size()];
        int index = 0;
        for(int num : resultSet){
            result[index++] = num;
        }

        return result;
    }
}