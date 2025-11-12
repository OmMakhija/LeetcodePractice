class Solution {
    public int search(int[] nums, int target) {
        int t = -1;
        int p=0;
        while(p<nums.length){
            if (nums[p]==target){
                return p;
            }
            p=p+1;
        }
        return t;
    }
}