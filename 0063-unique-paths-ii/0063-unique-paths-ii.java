class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //first row and first column
                if(i==0 || j==0){
                    //its prev cell was obstacle or if current cell is obstacle
                    if(obstacleGrid[i][j]==1 || 
                      (i!=0 && obstacleGrid[i-1][0]==0) ||
                      (j!=0 && obstacleGrid[i][j-1]==0)){
                        obstacleGrid[i][j]=0;
                    }
                    
                    else{
                        obstacleGrid[i][j]=1;
                    }
                }
                //All the other cells
                else{
                    if(obstacleGrid[i][j]==1){
                        obstacleGrid[i][j]=0;
                    }
                    else{
                        obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                    }
                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}