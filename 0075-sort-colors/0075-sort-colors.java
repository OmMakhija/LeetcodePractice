class Solution {
    public void sortColors(int[] nums) {
        int temp = 0;
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        
    }
}