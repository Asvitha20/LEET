bool checkPowersOfThree(int n) {
    while(n>0){
        if(n%3==1){
            n--;
        }
        if(n%3==2){
            return false;
        }
        if(n%3==0){
            n=n/3;
        }else{
            return false;
        }
    }
    return true;
}