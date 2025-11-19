class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = -1;
        if(nums.length<2){
            ans = nums[0];
        }
        int i=0;
        int j=1;
        while(j<=nums.length){
            if(j==nums.length){
                ans=nums[j-1];
                break;
            }
            else if(nums[i]!=nums[j]){
                ans=nums[i];
                break;
            }
            else{
                i+=2;
                j+=2;
            }
        
    }
    return ans;
}
}