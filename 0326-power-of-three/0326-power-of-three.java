class Solution {
    public boolean isPowerOfThree(int n) {
        
        int h=31;
        return check(n,h);
        
    }

    public static boolean check(int n, int h){
        if(n==Math.pow(3,h)){return true;}
        else if(h<0){return false;}
        else{
            return check(n,h-1);
        }
    }
}
