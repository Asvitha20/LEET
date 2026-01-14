class Solution {
    public void moveZeroes(int[] nums) {
        int movzero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[movzero];
                nums[movzero]=nums[i];
                nums[i]=temp;
                movzero++;
            }
        }
    }
}