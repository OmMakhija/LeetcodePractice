class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        boolean ans;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            ans=true;
        }
        else{
            ans = false;
        }
        return ans;

    }
}