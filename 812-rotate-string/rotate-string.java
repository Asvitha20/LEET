class Solution {
    public boolean rotateString(String s, String goal) {
        int i=1;
        String str;
        String temp;
        while(i<=s.length()){
            str=s.substring(1)+s.substring(0,1);
            s=str;
            if(str.equals(goal)){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}