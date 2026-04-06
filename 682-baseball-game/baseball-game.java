class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<op.length;i++)
            //char ch=op.charAt(i);
            if(op[i].equals("C")){
                st.pop();
            }else if(op[i].equals("D")){
                st.push(2*st.peek());
            }else if(op[i].equals("+")){
                    int temp=st.pop();
                    int sum=temp+st.peek();
                    st.push(temp);
                    st.push(sum);
                
            }else{
                st.push(Integer.parseInt(op[i]));
            }
        
        int tot=0;
        while(!st.isEmpty()){
            tot=tot+st.pop();
        }
    
        return tot;
    }
}