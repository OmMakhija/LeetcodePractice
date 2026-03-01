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
 import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if(k>0){
            ArrayList<Integer> finalList = new ArrayList<>();
            for(int i=0;i<k;i++){
                ListNode head = lists[i];
                while(head!=null){
                    finalList.add(head.val);
                    head=head.next;
                }

            }
            Collections.sort(finalList);
            ListNode fin = new ListNode();
            ListNode curr = fin;
            for(int i=0;i<finalList.size();i++){
                curr.next = new ListNode(finalList.get(i));
                curr=curr.next;
            }
            return fin.next;
        }
        return null;
        
    }
}