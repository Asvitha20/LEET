class Solution {
    public int[] twoSum(int[] n, int target) {
        int left=0;
        int right=n.length-1;
        int sum=0;
        int []res=new int[2];
        while(left<right){
            sum=n[left]+n[right];
            if(sum==target){
                res[0]=left+1;
                res[1]=right+1;
                return res;
            }
            if(sum>target){
                right--;
            }else{
                left++;
            }

        }
        return res;
    }
}