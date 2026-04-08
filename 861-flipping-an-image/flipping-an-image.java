class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // int n=image.length;
        // int[][] res=new int[n][n];
        // for(int i=0;i<n;i++){
        //     int j=n-1;
        //     for(int k=0;k<n;k++){
        //         res[i][k]=image[i][j]^1;
        //         j--;
        //     }
        // }
        // return res;

        for(int i=0;i<image.length;i++){
            int k=image.length-1;
            for(int j=0;j<image.length/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
                k--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
}