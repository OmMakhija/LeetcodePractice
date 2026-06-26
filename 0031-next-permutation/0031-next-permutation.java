import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint=-2;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                breakpoint=i-1;
                break;
            }
        }
        
        if(breakpoint==-2){
            Arrays.sort(nums);
            return;}
        int min = -1;
        int minVal = Integer.MAX_VALUE;
        for(int i=breakpoint+1;i<nums.length;i++){
            if (nums[i] > nums[breakpoint] && nums[i] <= minVal) {
                minVal = nums[i];
                min = i;
            }
        }
        int temp=nums[breakpoint];
        nums[breakpoint]=nums[min];
        nums[min]=temp;

        int totalTailElements = nums.length - (breakpoint + 1);

        for (int i = 0; i < totalTailElements / 2; i++) {
            int leftIdx = breakpoint + 1 + i;
            int rightIdx = nums.length - 1 - i;
            
            temp = nums[leftIdx];
            nums[leftIdx] = nums[rightIdx];
            nums[rightIdx] = temp;
        }

        return;

        
    }
}