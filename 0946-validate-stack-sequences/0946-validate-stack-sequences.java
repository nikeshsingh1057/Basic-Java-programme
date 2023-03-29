class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> st=new Stack<Integer>();
        int j=0;
        
        for(int i=0;i<pushed.length;i++)
        {
            st.push(pushed[i]);
            
            while(!st.isEmpty() && (st.peek()==popped[j])){
                
                st.pop();
                j++;
            }
             
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}