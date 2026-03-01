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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            count++;
        }
        ListNode fin = head;
        int currNo=0;
        if(count<2){
            return null;
        }
        while(currNo<(count/2)-1){
            fin=fin.next;
            currNo++;
        }
        fin.next=fin.next.next;
        return head;
    }
}