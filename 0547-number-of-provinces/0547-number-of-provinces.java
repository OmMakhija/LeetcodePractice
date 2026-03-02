class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected[0].length;
        int[] visited = new int[n+1];
        for(int i=0;i<=n;i++){
            visited[i]=0;
        }
        int provinces = 0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                dfs(isConnected, visited, i);
                provinces++;
            }
        }
        return provinces;

    }
    public void dfs(int[][] isConnected, int[] visited, int i){
        visited[i]=1;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && visited[j]==0){
                dfs(isConnected,visited,j);
            }
        }

    }
}