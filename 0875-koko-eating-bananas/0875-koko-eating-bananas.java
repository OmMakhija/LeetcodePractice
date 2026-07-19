class Solution {
    public int minEatingSpeed(int[] piles, int  hours) {
        Arrays.sort(piles);
        int l = 1;
        int h = piles[piles.length-1];

        int ans = Integer.MAX_VALUE;

        while(l<=h){
            int mid = (l+h)/2;
            int totalHours = totalCalc(piles,mid);
            if(totalHours<=hours){
                ans = mid;
                h = mid-1;
            }
            else{
                l=mid+1;
            }
        }
            return l;
        
    }

    public int totalCalc(int[] arr, int hourly){
        int totalHours = 0;
        for(int i=0;i<arr.length;i++){
            totalHours+=Math.ceil((double)arr[i]/(double)hourly);
        }
        return totalHours;
    }
}