#define MOD 1000000007
int numSub(char* s) {
    long int count=0;
    long int cur=0;
    int len=strlen(s);
    for(int i=0;i<len;i++){
        if(s[i]=='1'){
            cur++;
            count=(count+cur)%MOD;
        }else{
            cur=0;
        }
    }
    return count;
}