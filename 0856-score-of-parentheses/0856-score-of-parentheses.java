class Solution {
    public int scoreOfParentheses(String str) {
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='('){
                st.push(-1);
            }
            else{
                
                // case 1 agar pahele he mil jaye closing bracket i,e () 
                if(st.peek()==-1){
                    
                    st.pop();
                    st.push(1);
                }
                // case 2 agar direct closing bracket na mile tab ke liye i.e ((()))
                else{
                    
                    int val=0;
                    
                     while(st.peek()!=-1){
                        val += st.pop();
                     }
                    st.pop();              // last wala -1 ko remove karne ke liye.
                    st.push(2*val);
                }
               
            }
        }
//case 3  agar ()()()() type ka paranthsis raha to case 2 ke else me nahi jayega so we do thsi
        int val=0;
        
        while(!st.isEmpty())
            val+=st.pop();
        
        return val;
    }
}