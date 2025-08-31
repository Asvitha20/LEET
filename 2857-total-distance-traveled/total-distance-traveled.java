class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
         int d=0;
    while(mainTank>0){
    if(mainTank>=5){
        d=d+50;
        mainTank-=5;
        if(additionalTank>0){
            mainTank++;
            additionalTank--;
        }
    }else{
   d +=mainTank*10;
   mainTank=0;
    }
    }
    return d;
    }
}