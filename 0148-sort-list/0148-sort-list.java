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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> finalList = new ArrayList<>();

                ListNode curr1 = head;;
                while(curr1!=null){
                    finalList.add(curr1.val);
                    curr1=curr1.next;
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
}