class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        boolean ans;
        for(int i=1;i<num;i++){
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