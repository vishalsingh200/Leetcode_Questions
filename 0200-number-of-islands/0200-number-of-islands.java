class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean[m][n];
        int numsOfIs = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid, i, j, visited);
                    numsOfIs++;
                }
            }
        }
        return numsOfIs;
    }
    public void dfs(char [][] grid, int row, int column, boolean [][] visited){
        if (row < 0 || column < 0 || row >= grid.length || column >= grid[row].length || visited[row][column] || grid[row][column] == '0'){
            return;
        }
        visited[row][column] = true;
        dfs(grid, row, column - 1, visited);//left
        dfs(grid, row - 1, column, visited);//up
        dfs(grid, row, column + 1, visited);//right
        dfs(grid, row + 1, column, visited);//down
        
    }
}