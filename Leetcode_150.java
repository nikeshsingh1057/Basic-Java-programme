// Evaluate Reverse Polish Notation

class Solution {
    public int evalRPN(String[] str) {
        
    Stack<Integer> st=new Stack<>();
        
    for(int i=0;i<str.length;i++)
     {
            
       if(!str[i].equals("+")&&!str[i].equals("-")&&!str[i].equals("*")&&!str[i].equals("/"))
                st.push(Integer.parseInt(str[i]));
        
        else
        {
            int b=st.pop();
            int a=st.pop();
            int sum=0;
            
            if(str[i].equals("+"))
                sum = a+b;
            if(str[i].equals("-"))
                sum =a-b;
            if(str[i].equals("*"))
                sum =a*b;
            if(str[i].equals("/"))
                sum =a/b;
            st.push(sum);
        }
     }
     return st.pop();  
   }
}
