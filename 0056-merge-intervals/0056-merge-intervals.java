class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int n = intervals.length;
        for(int i=0;i<n;i++){
            if(list.isEmpty() || intervals[i][0]>list.get(list.size()-1)[1]){
                list.add(intervals[i]);
            }
            else{
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], intervals[i][1]);
            }
        }
        int k = list.size();
        int ans[][] = new int[k][2];

        for(int i=0;i<k;i++){
            for(int j=0;j<2;j++){
                ans[i][j]=list.get(i)[j];
            }
        }
        return ans;
    }
}