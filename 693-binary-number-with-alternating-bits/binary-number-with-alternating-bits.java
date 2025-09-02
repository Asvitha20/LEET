class Solution {
    public boolean hasAlternatingBits(int n) {
        int a=n&1;
    n>>=1;
    while(n>0){
        int b=n&1;
        if(b==a){
            return false;
        }
        a=b;
        n>>=1;
    }
    return true;
    }
}