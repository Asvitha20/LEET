class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            int j=n-1;
            for(int k=0;k<n;k++){
                res[i][k]=image[i][j]^1;
                j--;
            }
        }
        return res;
    }
}