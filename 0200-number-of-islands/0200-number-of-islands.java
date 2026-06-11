class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean [][] visited = new boolean[rows][cols];
        int countIslands=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfsHelper(grid, visited, i, j);
                    countIslands++;
                }
            }
        }
        return countIslands;
    }
    void dfsHelper(char[][] grid, boolean [][] visited, int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>= grid[0].length || visited[row][col] || grid[row][col] == '0'){
            return;
        }
        visited[row][col] = true;
        dfsHelper(grid, visited, row+1, col);
        dfsHelper(grid, visited, row-1, col);
        dfsHelper(grid, visited, row, col+1);
        dfsHelper(grid, visited, row, col-1);
    }
}