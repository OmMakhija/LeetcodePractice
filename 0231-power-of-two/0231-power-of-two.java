class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0;
        return check(n,x);
    }

    public static boolean check(int n, int x){
        if(n==Math.pow(2,x)){return true;}
        else if(Math.pow(2,x)>n){return false;}
        else{
            return check(n,x+1);
        }
    }
}