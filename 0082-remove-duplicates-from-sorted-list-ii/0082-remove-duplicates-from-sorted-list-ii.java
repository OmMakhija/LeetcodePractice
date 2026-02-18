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
        ListNode curr =head;
        HashSet<Integer> set = new HashSet<>();
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                set.add(curr.val);
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }
        ListNode curr1 =head;
        while(curr1!=null && curr1.next!=null){
            if(set.contains(curr1.next.val)){
                curr1.next=curr1.next.next;
            }
            else{
                curr1=curr1.next;
            }
        }
        return head;
    }
}