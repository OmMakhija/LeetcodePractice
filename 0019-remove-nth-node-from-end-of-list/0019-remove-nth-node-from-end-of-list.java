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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            return null;
        }

        int sz = 0;
        ListNode temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }


        int c = sz - n;
        int a = 1;


        ListNode dummy = new ListNode(0, head);
        ListNode currNode = dummy;

        while (a != c + 1) {
            currNode = currNode.next;
            a++;
        }


        currNode.next = currNode.next.next;

       
        ListNode newNode = dummy.next;
        ArrayList<Integer> stuff = new ArrayList<Integer>(); 
        while (newNode != null) {
            stuff.add(newNode.val); 
            newNode = newNode.next;
        }
        System.out.println(stuff);

        return dummy.next;
    }
}
