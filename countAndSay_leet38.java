// countAndSay

class Solution {
    public String countAndSay(int n) {
        
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        
        String s="11";
        int count=1;
        for(int j=3;j<=n;j++)
        {
            String t="";
            s+="&";  // to check last value. most important to do this.
            
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i-1)!=s.charAt(i))
                {
                    t+=count;
                    t+=s.charAt(i-1);
                    count=1;
                }
                else
                    count++;
            }
            s=t;
        }
        return s;
    }
}
