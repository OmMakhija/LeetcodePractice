class Solution {
    public double myPow(double x, int n) {
        if(x==1){
            return 1;
        }
        else if(x==-1 && n%2!=0){
            return -1;
        }
        else if(x==-1 && n%2==0){
            return 1;
        }
        else if(n<=-200000000 || n>=20000000){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        else if(n>0){
            return rec(x,n);
        }
        else{
            return 1 / rec(x, -n);
        }
        
    }

    public static double rec(double x, int n){
        if(n<2){return x;}
        else{
            return x*rec(x,n-1);
        }

    }

}