class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
     // approch eak charechtor ko lo and usko origingal substring jitna bana lo and check ksro 
    // vo equal hai .  agar nahi then fir two char lo fir s length tak usko bana lo and check 
    // karo if yes then return if not then make now three length and check it.
        
        int len=s.length();
        
        for (int i=0;i<s.length()/2;i++)
        {
            String ans=s.substring(0,i+1);
            String temp=ans;
            
            if(len % ans.length()==0){
                
                int n = len / ans.length();
                
                while(n>1){
                    
                    ans += temp;
                    n--;
                }
                    
            }
            if(ans.equals(s))
                return true;
        }
        return false;
    }
}