class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int pos_idx = 0;
        int neg_idx = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(pos_idx<pos.length){
                pos[pos_idx]=nums[i];
                pos_idx++;
                }
            }
            else if(nums[i]<0){
                if(neg_idx<neg.length){
                neg[neg_idx]=nums[i];
                neg_idx++;
                }
            }
        }
        pos_idx=0;
        neg_idx=0;
        for(int i=0;i<nums.length;i+=2){
            if(pos_idx<pos.length){
            nums[i]=pos[pos_idx];
            pos_idx++;
            }
        }
        for(int i=1;i<nums.length;i+=2){
            if(neg_idx<neg.length){
            nums[i]=neg[neg_idx];
            neg_idx++;
            }
        }
        return nums;
    }
}