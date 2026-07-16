class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerBound(nums,target,n);
        int[] ans = {-1,-1};
        if(lb==n || nums[lb]!=target)return ans;
        ans[0]=lb;
        ans[1]=upperBound(nums,target,n)-1;
        return ans;
    }
    
    public int lowerBound(int[] arr, int k, int n){
        int l=0;
        int r=n-1;
        int ans = n;

        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>=k){
                ans = mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }

    public int upperBound(int[] arr, int k, int n){
        int l=0;
        int r=n-1;
        int ans = n;

        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>k){
                ans = mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}