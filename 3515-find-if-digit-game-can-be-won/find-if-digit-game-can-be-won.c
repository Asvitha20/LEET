bool canAliceWin(int* nums, int numsSize) {
    int tot=0;
    int sum=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]<10){
            sum=sum+nums[i];
        }
        if(nums[i]>9){
            tot=tot+nums[i];
        }
    }
    if(sum==tot){
        return false;
    }
    return true;
   
}