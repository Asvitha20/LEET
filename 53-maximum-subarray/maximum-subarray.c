int maxSubArray(int* nums, int numsSize) {
    int max=INT_MIN;
    int cursum=0;
    for(int i=0;i<numsSize;i++){
        cursum+=nums[i];
        if(cursum>max) max=cursum;
        if(cursum<0) cursum=0;
    }
    return max;
}