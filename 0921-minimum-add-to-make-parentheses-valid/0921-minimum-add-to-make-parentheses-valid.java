class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st=new Stack<>();
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push('(');
            
            else if(!st.isEmpty() && matching(st.peek(),s.charAt(i)))
                st.pop();
            else
                count++;
        }
        return count+st.size();
    }
    
    public static boolean matching(char a,char b)
    {
       return (a=='('&& b==')');
    }
}