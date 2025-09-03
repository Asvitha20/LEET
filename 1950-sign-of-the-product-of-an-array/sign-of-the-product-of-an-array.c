int arraySign(int* nums, int numsSize) {
    int c=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]==0){
            return 0;
        }
         if(nums[i]<0){
            c++;
         }
    }
    if(c%2==0){
        return 1;
    }
    return-1;
        
    }