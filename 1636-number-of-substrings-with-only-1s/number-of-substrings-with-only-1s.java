class Solution {
    public int numSub(String s) {
           long count = 0;
        long cur = 0;
        long MOD = 1000000007;
        int len = s.length();

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '1'){
                cur++;
                count = (count + cur) % MOD;
            } else {
                cur = 0;
            }
        }

        return (int) count;
    }
}