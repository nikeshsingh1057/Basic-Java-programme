class Solution {
    public boolean wordPattern(String p, String s) {
        
        String str[]=s.split(" ");
        
        if(p.length()!=str.length)
            return false;
        
        HashMap<Character,String> hs= new HashMap<>();
        HashMap<String,Boolean> used= new HashMap<>();  
         
        for(int i=0;i<p.length();i++)
        {
            if(!hs.containsKey(p.charAt(i)) )
            {
                if(used.get(str[i])!=null && used.get(str[i])==true)
                    return false;
                
                hs.put(p.charAt(i),str[i]);
                used.put(str[i],true);
            }
            
           
            else if(!hs.get(p.charAt(i)).equals((str[i])) )    
                return false;
        }
        return true;
    }
}