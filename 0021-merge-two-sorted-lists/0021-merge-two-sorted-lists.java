class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = ans;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ptr.next = new ListNode(list1.val);
                ptr = ptr.next;
                list1 = list1.next;
            }
            else{
                ptr.next = new ListNode(list2.val);
                ptr = ptr.next;
                list2 = list2.next;
            }
        }

        if (list1 != null) ptr.next = list1;
        else ptr.next = list2;

        return ans.next;
    }
}
