class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        if(nums.length<2){
            ans=nums[0];
        }
        for(int i=1;i<nums.length-1;i=i+2){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                ans=nums[i];
                break;
            }
            else if(nums[i]==nums[i+1] && nums[i]!=nums[i-1]){
                ans = nums[i-1];
                break;
            }
            else if(nums[i]==nums[i-1] && nums[i]!=nums[i+1]){
                ans = nums[i+1];
                break;
            }
            else if(nums[nums.length-1]!=nums[nums.length-2]){
                ans=nums[nums.length-1];
                break;
            }
            else if(nums[0]!=nums[1]){
                ans=nums[0];
                break;
            }
        }
        return ans;
    }
}