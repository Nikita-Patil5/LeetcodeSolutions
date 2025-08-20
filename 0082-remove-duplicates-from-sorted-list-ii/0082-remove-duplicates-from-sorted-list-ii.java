/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode current = head;
        ListNode prev = dummyNode;

        while(current != null){
            if(current.next != null && current.val == current.next.val){
                int duplicateVal = current.val;

                while(current != null && current.val == duplicateVal){
                    current = current.next;
                }

                prev.next = current;
            } else {
                prev = current;
                current = current.next;
            }

        }

        return dummyNode.next;
        
    }
}