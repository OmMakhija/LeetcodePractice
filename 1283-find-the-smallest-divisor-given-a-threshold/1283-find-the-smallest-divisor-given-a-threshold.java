class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int h=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>h){
                h=nums[i];
            }
        }
        int ans = 1;
        while(l<=h){
            int mid = (l+h)/2;
            if(works(nums,mid,threshold)){
                ans = mid;
                h = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean works(int[] nums, int num, int threshold){
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=(int) Math.ceil((double) nums[i] / num);
        }
        if(sum<=threshold)return true;
        return false;
    }
}