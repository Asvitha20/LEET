class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> s= new HashSet<>();
        int c=0;
        for(int i=nums.size()-1;i>=0;i--){
            c++;
            if(nums.get(i)<=k){
                s.add(nums.get(i));
            }
            if(s.size()==k){
                return c;
            }
        }
        return c;
    }
}