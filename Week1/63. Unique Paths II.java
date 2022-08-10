class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        int ans = helper(obstacleGrid, 0, 0, m, n, dp);
        return ans;
    }
    
    int helper(int[][] mat, int x, int y, int m, int n, int[][] dp)
    {
     
        if(x == m || y == n || mat[x][y] == 1)
            return 0;
        
        if(x == m-1 && y == n-1)
        {
            if(mat[x][y] == 1) return 0;
            else
                return 1;
        }
        
        if(dp[x][y] > 0)
            return dp[x][y];
        
        return dp[x][y] = helper(mat, x+1, y, m, n, dp) + helper(mat, x, y+1, m, n, dp);
        
    }
}
