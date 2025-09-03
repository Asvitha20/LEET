int missingNumber(int* nums, int numsSize) {
    int sum=0;
    int ac;
    int n=numsSize;
    ac=n*(n+1)/2;
    for(int i=0;i<n;i++){
        sum=sum+nums[i];
    }
    return ac-sum;;
}