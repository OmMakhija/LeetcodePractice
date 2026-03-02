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
    public int getDecimalValue(ListNode head) {
        int length=0;
        ListNode curr1 = head;
        while(curr1!=null){
            curr1=curr1.next;
            length++;
        }
        int pos=0;
        ListNode curr = head;
        double ans = 0;
        while(curr!=null){
            if(curr.val==1){
                ans = ans+Math.pow(2,length-pos-1);
            }
            curr=curr.next;
            pos++;
        }
        return (int)ans;
    }
}