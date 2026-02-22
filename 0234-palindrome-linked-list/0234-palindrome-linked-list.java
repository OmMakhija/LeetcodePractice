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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            nums.add(curr.val);
            curr=curr.next;
        }
        ArrayList<Integer> nums1 = new ArrayList<>(nums);
        Collections.reverse(nums);
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)!=nums1.get(i)){
                return false;
            }
        }
        return true;
    }
}