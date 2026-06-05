class Solution {
    public int numEnclaves(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            if(grid[i][0]==1){
                dfs(grid,i,0);
            }
            if(grid[i][col-1]==1){
                dfs(grid,i,col-1);
            }
        }
            for(int j=0;j<col;j++){
                if(grid[0][j]==1){
                    dfs(grid,0,j);
                }
                if(grid[row-1][j]==1){
                    dfs(grid,row-1,j);
                }
            }
                int count=0;
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        if(grid[i][j]==1){
                            count++;
                        }
                    }
                }
        return count; 
    }
    public void dfs(int[][] grid,int r,int c){

        if(r<0 ||
           c<0 ||
           r>=grid.length ||
           c>=grid[0].length ||
           grid[r][c]==0)
            return;

        grid[r][c]=0;

        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}