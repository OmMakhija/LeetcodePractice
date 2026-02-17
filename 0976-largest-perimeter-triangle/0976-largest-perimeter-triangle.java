class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i-2] + nums[i-1] > nums[i]){
                ans=Math.max(ans,nums[i]+nums[i-1]+nums[i-2]);
            }
        }
        return ans;
    }
}