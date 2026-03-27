class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max_c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                // if(c>max_c){
                // max_c=c;
                // }
                max_c=Math.max(max_c,c);
            }
            else{
                c=0;
            }
        }
        return max_c;
    }
}