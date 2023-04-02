class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Integer> st=new Stack<>();
        
        String ans="";
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='('){
                st.push(-1);
                
                if(st.size()>1)
                    ans+='(';
                }
            
            else if(st.size()>1 && ch==')'){
                ans+=')';
                st.pop();
            }
            else st.pop();
        }
        
        return ans;
    } 
}