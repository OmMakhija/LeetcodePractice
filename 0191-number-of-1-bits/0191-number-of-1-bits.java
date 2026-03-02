class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n>0){
            int digit = n%2;
            n=n/2;
            if(digit==1){
                ans++;
            }
        }
        return ans;
    }
}