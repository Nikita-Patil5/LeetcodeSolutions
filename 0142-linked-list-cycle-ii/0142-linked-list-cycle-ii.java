/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Boolean> visitedList = new HashMap<>();
        ListNode current = head;

        while(current != null){
            if(visitedList.containsKey(current)){
                return current;
            }

            visitedList.put(current,true);
            current = current.next;
        }

        return null;
    }
}