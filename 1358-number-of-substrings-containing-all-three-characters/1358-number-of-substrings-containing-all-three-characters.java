class Solution {
    public int numberOfSubstrings(String s) {
        
        int count[] = {0, 0, 0}, res = 0 , j = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            count[s.charAt(i) - 'a']++;
            
            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
                count[s.charAt(j++) - 'a']--;
            
            res += j;
        }
        
        return res;
    }
}


// in similar way 

class Solution {
        public int numberOfSubstrings(String s) {
            
        int[] count = new int[3];
        int ans = 0;
        int lo = 0;
        for (int hi = 0; hi < s.length(); ++hi) {
            
            count[s.charAt(hi) - 'a']++;
            
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                
                ans += s.length() - hi;
                count[s.charAt(lo++) - 'a']--;
            }
        }   
        return ans;        
    }
}
