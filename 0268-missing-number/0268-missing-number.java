class Solution {
    public int missingNumber(int[] nums) {
    int size=nums.length;
    for (int i = 0; i < size - 1; i++){
      for (int j = 0; j < size - i - 1; j++){
      
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
          
            }
        }

    }

    int[] ans=new int[nums.length+1];
    for(int i=0;i<ans.length;i++){
        ans[i]=i;
    }
    int ans1=-1;
    for(int i=0;i<size;i++){
        if(nums[i]!=ans[i]){
            if(ans1==-1){
                ans1=ans[i];
            }
        }
    }
    if(ans1==-1){
        ans1=nums[nums.length-1]+1;
    }
    return ans1;
}
}