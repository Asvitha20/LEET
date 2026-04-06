class Solution {
    public String removeStars(String s) {
        Stack<Character> t=new Stack<>();
        int i=0;
        while(i!=s.length()){
            char ch=s.charAt(i);
            if(ch!='*'){
                t.push(ch);
                i++;
            }else{
                t.pop();
                i++;
            }
        }
        String res="";
        while(!t.isEmpty()){
            res=res+t.pop();
        }
        String rev=new StringBuilder(res).reverse().toString();
        return rev;
    }
}