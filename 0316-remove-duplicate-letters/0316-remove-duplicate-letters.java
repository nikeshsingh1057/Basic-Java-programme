class Solution {
    public String removeDuplicateLetters(String s) {
        
        int arr[]=new int[26];
        
        // adding frequancy of each character
        
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        
        // creating visiting to check char is vidited or not
        
        int bool_visited[]=new int[26];      
        
        Stack<Character> st=new Stack<>();   
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            arr[ch-'a']--;
            
            if(bool_visited[ch-'a']==0)
            {
                while(!st.isEmpty() && st.peek()>ch && arr[st.peek()-'a']>0){
                    
                    bool_visited[st.pop()-'a']=0;
                }
                
                st.push(ch);
                bool_visited[ch-'a']=1;
            }
            
            
        }
      
        String ans="";
        
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        
        StringBuilder sb = new StringBuilder(ans);
        
        ans="";
        sb.reverse(); 
        ans+=sb;
        
        return ans;
    }
}