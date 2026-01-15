class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    Numbers.add(nums1[i]);
                    nums1[i]=nums1[i]-1000;
                    nums2[j]=nums2[j]-2000;
                }
            }
        }
        int[] ans = new int[Numbers.size()];
        for (int i = 0; i < Numbers.size(); i++) {
            ans[i] = Numbers.get(i); 
        }
        return ans;
    }

}