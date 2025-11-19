import java.util.*;
class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> nums2 = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            nums2.add(nums[i]);
        }
        while(nums2.contains(original)){
            original=original*2;
        }
        return original;
    }
}