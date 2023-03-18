class Solution {
    public char findTheDifference(String s, String t) {
        
        if(s.length()==0)
            return t.charAt(0);
       
        int arr[]=new int[26];
        
        for(int i=0;i<t.length();i++)
        {
            int in=t.charAt(i)-'a';
            arr[in]++;
        }
        
        for(int i=0;i<s.length();i++)
        {
            int in=s.charAt(i)-'a';
            arr[in]--;
        }
        
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
                return (char)(i+97);
        }
        return '.';
    }
}