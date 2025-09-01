bool hasTrailingZeros(int* nums, int numsSize) {
    int c=0;
    for(int i=0;i<numsSize;i++){
        if(*(nums+i)%2==0)
{
    c++;
}    }
if(c>=2){
    return true;
}
return false;
}