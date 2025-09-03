int findNumbers(int* nums, int numsSize) {
    int count=0;
    for(int i=0;i<numsSize;i++){
        int n= *(nums+i);
        int c=0;
        while(n>0){
           n=n/10;
           c++;
        }
        if(c%2==0){
            count++;
        }
    }
    return count;
}