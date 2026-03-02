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
    public int[] nextLargerNodes(ListNode head) {
        int length=0;
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        int[] ans = new int[length];
        ListNode curr1=head;
        ListNode curr2=head.next;
        int pos = 0;
        while(curr1.next!=null){
            while(curr2!=null){
                if(curr2.val>curr1.val){
                    ans[pos]=curr2.val;
                    break;
                }
                curr2=curr2.next;
            }
            curr1=curr1.next;
            curr2=curr1.next;
            pos++;

        }
        return ans;
    }
}