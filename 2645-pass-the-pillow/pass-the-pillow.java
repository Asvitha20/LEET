class Solution {
    public int passThePillow(int n, int time) {
         int i=0,j=1;
    int t=0;
    while(t!=time){
        if(j==1){
            i++;
        }else{
            i--;
        }
        if(i==n-1){
            j=-1;
        }
        if(i==0){
            j=1;
        }
        t++;
    }
    return i+1;
    }
}