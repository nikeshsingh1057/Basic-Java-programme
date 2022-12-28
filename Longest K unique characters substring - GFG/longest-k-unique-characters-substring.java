//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        
        HashMap<Character,Integer> hs=new HashMap<>();
        
        int i=0,j=0,ans=-1;
        
        while(i<s.length())
        {
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
            
          
            if(hs.size()==k)
            {
                ans=Math.max(ans,i-j+1);
            }
            
            else {
                  
                  while(hs.size()>k)
                    {
                        if(hs.get(s.charAt(j))==1)
                            hs.remove(s.charAt(j));
                        else
                        {
                          hs.put(s.charAt(j) , hs.get(s.charAt(j))-1);     
                        }
                        
                        j++;
                    }
            }
            i++;
        }
        return ans;
    }
}