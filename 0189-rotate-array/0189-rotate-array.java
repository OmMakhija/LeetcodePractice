import java.util.ArrayList;

class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k=k%l;

        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        if(l!=1){
        for(int i=l-k;i<l;i++){
            nums1.add(nums[i]);
        }
        for(int i=0;i<l-k;i++){
            nums1.add(nums[i]);
        }

        
        for(int i=0;i<l;i++){
            nums[i]=nums1.get(i);
        }
        }
    }
}