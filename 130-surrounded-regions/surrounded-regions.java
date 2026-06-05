class Solution {

    public void solve(char[][]grid) {
        for(int i=0;i<grid.length;i++){
            dfs(grid,i,0);
            dfs(grid,i,grid[0].length-1);
        }
        for(int i=0;i<grid[0].length;i++){
            dfs(grid,0,i);
            dfs(grid,grid.length-1,i);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!='#'){
                    grid[i][j]='X';
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='#'){
                    grid[i][j]='O';
                }
            }
        }
            
    }
    
    public void dfs(char[][]grid,int r,int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length) return;
        if(grid[r][c]!='O') return;
        grid[r][c]='#';
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
    }
}