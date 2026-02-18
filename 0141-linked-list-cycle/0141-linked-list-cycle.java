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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        HashSet<ListNode> set = new HashSet<>();
        boolean ans = false;
        while(curr!=null && curr.next!=null){
            if(!set.contains(curr)){
                set.add(curr);
            }
            else if(set.contains(curr)){
                ans = true;
                break;
            }
            curr = curr.next;
        }
        return ans;
        
    }
}