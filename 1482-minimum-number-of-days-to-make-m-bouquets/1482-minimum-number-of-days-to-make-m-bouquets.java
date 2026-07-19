class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m*k > bloomDay.length) return -1;

        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<l){
                l=bloomDay[i];
            }
            if(bloomDay[i]>h){
                h=bloomDay[i];
            }
        }


        while(l<=h){
            int mid = l + (h - l) / 2;
            if(possible(bloomDay,mid,m,k)>=m){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }

    public int possible(int[] arr, int day, int m, int k){
        int count = 0;
        int NOB = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                NOB+=count/k;
                count=0;
            }
        
        }
        NOB+=count/k;
        return NOB;
    }
}